package phases;

import classes.Class;
import com.sun.jdi.Value;
import functions.Function;
import functions.ReturnValue;
import gen.CantoBaseVisitor;
import gen.CantoParser;
import scopes.GlobalScope;
import scopes.LocalScope;
import scopes.Scope;
import symbols.ListSymbol;
import symbols.Symbol;
import symbols.VarSymbol;

import java.util.*;

public class ExprPhase extends CantoBaseVisitor {
    GlobalScope globals;
    Scope currentScope;

    // This will be called if we encounter a return statement
    // and throw it up to the calling Function class
    static ReturnValue retvalue = new ReturnValue();

    // Used for tracking names to functions
    Map<String, Function> functions = new HashMap<>();
    Map<String, Class> classes = new HashMap<>();

    public ExprPhase() {}

    // This constructor will be utilized by Function to
    // give a current scope and the set of current functions
    public ExprPhase(Scope currentScope, Map<String, Function> functions) {
        this.currentScope = currentScope;
        this.functions = functions;
    }

    /**
     * Starting point of our program
     * @return Return 0 if success, anything else is failure
     */
    public Integer visitFile(CantoParser.FileContext ctx) {
        this.globals = new GlobalScope(null);
        this.currentScope = globals;

        visitChildren(ctx);

        System.out.println("Program executed successfully!");

        return 0;
    }

    /**
     * Simply visits children statements and follows their rules
     */
    public Value visitStatement(CantoParser.StatementContext ctx) {
        visitChildren(ctx);

        return null;
    }

    /**
     * There are two types of variable declaration, both of which have rules declared below.
     * There is the mutable var and immutable let.
     */
    public Value visitVarDecl(CantoParser.VarDeclContext ctx) {
        visitChildren(ctx);

        return null;
    }

    /**
     * Used for resetting a variable's value. Eventually mutability checking will
     * be added.
     * Has the form x = expr where x is currently a variable in the symbol table.
     */
    public Object visitAssign(CantoParser.AssignContext ctx) {

        var exprValue = visit(ctx.expr());

        var symbolToChange = currentScope.resolve(ctx.ID().getText());

        // Need to add type checking in here that ensures
        // we don't allow a variable to get an incorrect value
        symbolToChange.setObjectValue(exprValue);

        return null;
    }

    public Value visitMutVarDecl(CantoParser.MutVarDeclContext ctx) {
        String varType = ctx.type().getText();

        VarSymbol newVar = new VarSymbol(ctx.ID().getText(), varType);
        var returnedValue = visit(ctx.expr());
        newVar.setObjectValue(returnedValue);

        currentScope.define(newVar);

        return null;
    }

    public Object visitForRange(CantoParser.ForRangeContext ctx) {
        var start = (Integer) visit(ctx.expr(0));
        var end = (Integer) visit(ctx.expr(1));
        var by = 1;

        var newSymbol = new VarSymbol(ctx.ID().getText(), "int");
        currentScope.define(newSymbol);

        if (ctx.expr(2) != null) {
            by = (Integer) visit(ctx.expr(2));
        }

        for (int i = start; i <= end; i += by) {
            newSymbol.setObjectValue(i);
            visit(ctx.statement());
        }

        return null;
    }

    /**
     * Currently the program handles return statements by throwing an error and then
     * having them caught in the invoke function method.
     * @return Nothing. Throws an exception if encountered.
     */
    public Object visitReturn(CantoParser.ReturnContext ctx) {
        retvalue.value = visit(ctx.expr());

        throw retvalue;
    }

    public Value visitBlock(CantoParser.BlockContext ctx) {
        // Create a new scope for the block
        currentScope = new LocalScope(currentScope);
        visitChildren(ctx);
        currentScope = currentScope.getEnclosingScope();

        return null;
    }

    /**
     * Simple method for printing the expression found within print()
     */
    public Object visitPrint(CantoParser.PrintContext ctx) {
        var result = visit(ctx.expr());

        if (result == null) {
            System.out.println("Null");
            return null;
        }

        System.out.println(result);

        return null;
    }

    /**
     * Implementation of while loop in language. Get the condition that is
     * represented in the expression and continue executing the block of code
     * attached to it until the condition is no longer met.
     */
    public Object visitWhile(CantoParser.WhileContext ctx) {
        boolean condition = Boolean.parseBoolean(visit(ctx.expr()).toString());

        while (condition) {
            visit(ctx.block());

            condition = Boolean.parseBoolean(visit(ctx.expr()).toString());
        }

        return null;
    }

    /**
     * Until is simply just while (not cond)
     */
    public Object visitUntil(CantoParser.UntilContext ctx) {
        boolean condition = Boolean.parseBoolean(visit(ctx.expr()).toString());

        while (!condition) {
            visit(ctx.block());

            condition = Boolean.parseBoolean(visit(ctx.expr()).toString());
        }

        return null;
    }

    public Object visitImmutListDecl(CantoParser.ImmutListDeclContext ctx) {
        var values = visitExprList(ctx.exprList());
        var listType = "list" + "[" + ctx.type().getText() + "]";

        Symbol immutList = new ListSymbol(ctx.ID().getText(), ctx.type().getText(), listType, new ArrayList<Object>());
        immutList.setObjectValue(values);

        currentScope.define(immutList);

        return values;
    }

    public Object visitMutListDecl(CantoParser.MutListDeclContext ctx) {
        var values = visitExprList(ctx.exprList());

        var listType = "list" + "[" + ctx.type().getText() + "]";

        Symbol mutList = new ListSymbol(ctx.ID().getText(), ctx.type().getText(), listType, new ArrayList<Object>());
        mutList.setObjectValue(values);

        currentScope.define(mutList);

        return values;
    }

    public Object visitClassDecl(CantoParser.ClassDeclContext ctx) {
        String className = ctx.ID().getText();

        if(classes.containsKey(className)) {
            System.out.println("Class " + className + " is already defined");
            return null;
        }

        Class newClass = new Class();

        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof CantoParser.ClassVarDeclContext) {
                Object value = null;
                var memberVariable = (CantoParser.ClassVarDeclContext) ctx.children.get(i);

                newClass.definePublicMember(memberVariable.ID().getText(), value);
            }
            else if (ctx.children.get(i) instanceof CantoParser.ClassVarInitContext) {
                String varName = String.valueOf(((CantoParser.ClassVarInitContext) ctx.children.get(i)).ID());
                Object value = visit(ctx.children.get(i));

                newClass.definePublicMember(varName, value);
            }
            else if (ctx.children.get(i) instanceof CantoParser.ClassMethodContext) {
                System.out.println("Defining a method");
            }
        }

        return null;
    }

    public Object visitClassVarInit(CantoParser.ClassVarInitContext ctx) {
        return visit(ctx.expr());
    }

    public Object visitClassVar(CantoParser.ClassVarContext ctx, Class classToModify) {
        System.out.println("Going to define a class variable here");

        return null;
    }


    public Object visitClassMethod(CantoParser.ClassMethodContext ctx, Class classToModify) {
        System.out.println("Going to define a class method here");

        return null;
    }

    public Object visitListConcat(CantoParser.ListConcatContext ctx) {
        var listSymbol = currentScope.resolve(ctx.ID().toString());
        var listObj = listSymbol.getValue();

        if (!(listObj instanceof List)) {
            System.out.println("Object must be a list");
            return null;
        }

        List<Object> listToUse = (List<Object>) listObj;
        var objectToAdd = visit(ctx.expr());

        listToUse.add(objectToAdd);

        return null;
    }

    /**
     * Declares a function.
     */
    public Object visitFuncDecl(CantoParser.FuncDeclContext ctx) {
        String funcName = ctx.ID().getText();

        var argList = visitArgList(ctx.argList());

        // Define the new function and put it in our functions map
        Function newFunction = new Function(currentScope, argList, ctx.block());
        functions.put(funcName, newFunction);

        return null;
    }

    /**
     * Gather all the arguments to a function call
     * @return A list of symbols that represent our arguments
     */
    public List<VarSymbol> visitArgList(CantoParser.ArgListContext ctx) {
        List<VarSymbol> arguments = new ArrayList<>();

        for (int i = 0; i < ctx.arg().size(); i++) {
            var symbolName = ctx.arg(i).ID().getText();
            var symbolType = ctx.arg(i).type().getText();

            VarSymbol vs = new VarSymbol(symbolName, symbolType);

            arguments.add(vs);
        }

        return arguments;
    }

    /**
     * Used for invoking a function.
     * @return Any return value that is thrown during execution
     */
    public Object visitCall(CantoParser.CallContext ctx) {

        if (!functions.containsKey(ctx.ID().getText())) {
            System.out.println("Function not defined");
        }

        var functionToCall = functions.get(ctx.ID().getText());
        var params = visitExprList(ctx.exprList());

        var returnValue = functionToCall.invoke(params, functions);

        return returnValue;
    }

    /**
     * @return Returns a list of objects that are the evaluated expressions
     */
    public List<Object> visitExprList(CantoParser.ExprListContext ctx) {

        List<Object> exprList = new ArrayList<>();

        // Handle the case of an initial empty list
        if (ctx == null) {
            return exprList;
        }

        for (int i = 0; i < ctx.expr().size(); i++) {
            var exprToAdd = visit(ctx.expr(i));

            exprList.add(exprToAdd.toString());
        }

        return exprList;
    }

    public Object visitParens(CantoParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    public String visitString(CantoParser.StringContext ctx) {
        String childString = ctx.getChild(0).getText();

        return childString.substring(1, childString.length() - 1);
    }

    public Object visitForEach(CantoParser.ForEachContext ctx) {
        var listObj = currentScope.resolve(ctx.ID(1).getText()).getValue();

        var iterationVariableName = ctx.ID(0).getText();
        var iterationVariableType = currentScope.resolve(ctx.ID(1).getText()).getType();
        var iterationVariable = new VarSymbol(iterationVariableName, iterationVariableType);

        currentScope.define(iterationVariable);

        if (!(listObj instanceof List<?>)) {
            System.out.println("Not a list");
            return null;
        }

        for (var iter : (List)listObj) {
            iterationVariable.setObjectValue(iter);

            visit(ctx.statement());
        }

        return null;
    }

    public String visitChar(CantoParser.CharContext ctx) {
        String childChar = ctx.getChild(0).getText();

        return childChar.substring(1, childChar.length() - 1);
    }

    public Object visitAdd(CantoParser.AddContext ctx) {
        var leftValue = visit(ctx.expr(0));
        var rightValue = visit(ctx.expr(1));

        // Consider the operation string concatenation
        if (leftValue instanceof String) {
            return leftValue + rightValue.toString();
        }

        if (leftValue instanceof Integer && rightValue instanceof Integer) {
            return (Integer) leftValue + (Integer) rightValue;
        }
        else {
            System.out.println("Invalid addition taking place");
            return null;
        }

    }

    public Integer visitMult(CantoParser.MultContext ctx) {
        return (Integer)visit(ctx.expr(0)) * (Integer)visit(ctx.expr(1));
    }

    public Object visitIncrement(CantoParser.IncrementContext ctx) {
        var symbolToModify = currentScope.resolve(ctx.ID().getText());
        var currentValue = (Integer) symbolToModify.getValue();

        symbolToModify.setObjectValue(currentValue + (Integer) visit(ctx.expr()));

        return null;
    }

    public Object visitListIndex(CantoParser.ListIndexContext ctx) {
        var listSymbol = currentScope.resolve(ctx.ID().toString());
        var listObj = listSymbol.getValue();
        var index = Integer.parseInt(ctx.expr(0).getText());
        var newValue = visit(ctx.expr(1));

        if (!(listObj instanceof List)) {
            System.out.println("Object must be a list");
            return null;
        }

        List<Object> listToUse = (List<Object>) listObj;

        listToUse.set(index, newValue);

        return null;
    }

    public Object visitDecrement(CantoParser.DecrementContext ctx) {
        var symbolToModify = currentScope.resolve(ctx.ID().getText());
        var currentValue = (Integer) symbolToModify.getValue();

        symbolToModify.setObjectValue(currentValue - (Integer) visit(ctx.expr()));

        return null;
    }

    public Integer visitMod(CantoParser.ModContext ctx) {
        var leftSide = visit(ctx.expr(0));
        var rightSide = visit(ctx.expr(1));

        if (!(leftSide instanceof Integer)) {
            System.out.println("Modulus must have integer arguments");
        }

        if (!(rightSide instanceof Integer)) {
            System.out.println("Modulus must have integer arguments");
        }

        assert leftSide instanceof Integer;
        assert rightSide instanceof Integer;
        return (Integer)leftSide % (Integer)rightSide;
    }

    public Integer visitSub(CantoParser.SubContext ctx) {
        return (Integer)visit(ctx.expr(0)) - (Integer)visit(ctx.expr(1));
    }

    public Integer visitInt(CantoParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    public Boolean visitBool(CantoParser.BoolContext ctx) {
        if (ctx.getText().equals("true")) {
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }

    public Boolean visitAnd(CantoParser.AndContext ctx) {
        var leftSide = Boolean.valueOf(visit(ctx.expr(0)).toString());
        var rightSide = Boolean.valueOf(visit(ctx.expr(1)).toString());

        return leftSide && rightSide;
    }

    public Boolean visitOr(CantoParser.OrContext ctx) {
        var leftSide = Boolean.valueOf(visit(ctx.expr(0)).toString());
        var rightSide = Boolean.valueOf(visit(ctx.expr(1)).toString());

        return leftSide || rightSide;
    }

    /**
     * Evaluates an if-elseif-else expression. First it checks if the if condition is met, if it is then it visits
     * the statement/block associated with it. From there it iterates through all else-if statements and tests if any
     * of those conditions are met, if they are it executes those blocks. From there, if none of the conditions have
     * been satisfied then it always visits else's block.
     */
    public Object visitIf(CantoParser.IfContext ctx) {
        Object resultOfExpr = visit(ctx.expr());

        if (!(resultOfExpr instanceof Boolean)) {
            System.out.println("If statement must have boolean conditional!");
            return null;
        }

        if ((Boolean) resultOfExpr) {
            visit(ctx.statement());
            return null;
        }

        // Test else-ifs to find out if any of them should be executed
        for (int i = 0; i < ctx.elseIf().size(); i++) {
            Object resultOfElseIf = visit(ctx.elseIf(i).expr());

            if (!(resultOfElseIf instanceof Boolean)) {
                System.out.println("Else-if statement must have boolean conditional!");
                return null;
            }

            if ((Boolean) resultOfElseIf) {
                visit(ctx.elseIf(i).statement());
                return null;
            }
        }

        // If no other conditions have been met then execute else if it exists
        if (ctx.else_() != null) {
            visit(ctx.else_().statement());
        }

        return null;
    }

    public Boolean visitNot(CantoParser.NotContext ctx) {
        boolean singleUnit = Boolean.parseBoolean(visit(ctx.expr()).toString());

        return !singleUnit;
    }

    public Boolean visitLessThan(CantoParser.LessThanContext ctx) {
        int leftSide = Integer.parseInt(visit(ctx.expr(0)).toString());
        int rightSide = Integer.parseInt(visit(ctx.expr(1)).toString());

        return leftSide < rightSide;
    }

    public Boolean visitLessThanOrEqual(CantoParser.LessThanOrEqualContext ctx) {
        int leftSide = Integer.parseInt(visit(ctx.expr(0)).toString());
        int rightSide = Integer.parseInt(visit(ctx.expr(1)).toString());

        return leftSide <= rightSide;
    }

    public Boolean visitGreaterThan(CantoParser.GreaterThanContext ctx) {
        int leftSide = Integer.parseInt(visit(ctx.expr(0)).toString());
        int rightSide = Integer.parseInt(visit(ctx.expr(1)).toString());

        return leftSide > rightSide;
    }

    public Boolean visitGreaterThanOrEqual(CantoParser.GreaterThanOrEqualContext ctx) {
        int leftSide = Integer.parseInt(visit(ctx.expr(0)).toString());
        int rightSide = Integer.parseInt(visit(ctx.expr(1)).toString());

        return leftSide >= rightSide;
    }

    public Boolean visitEqual(CantoParser.EqualContext ctx) {
        Object leftSide = visit(ctx.expr(0));
        Object rightSide = visit(ctx.expr(1));

        if (!leftSide.getClass().equals(rightSide.getClass())) {
            System.out.println("Can't compare items that are not of the same type!");
        }

        return leftSide.equals(rightSide);
    }

    public Object visitIndex(CantoParser.IndexContext ctx) {
        int index = Integer.parseInt(ctx.INT().getText());

        var listSymbol = currentScope.resolve(ctx.ID().toString());
        var listObj = listSymbol.getValue();

        if (!(listObj instanceof List)) {
            System.out.println("Object must be a list!");
            return null;
        }

        var listToUse = ((List<?>) listObj);

        if (listToUse.size() <= index || index < 0) {
            System.out.println("Invalid index for list of size: " + listToUse.size());
            return null;
        }

        return listToUse.get(index);
    }

    /**
     * Visits a variable in our symbol table and gets its value. In here we also take consideration
     * of the value's type, so we can correctly cast it.
     * @return The value associated with the variable.
     */
    public Object visitVar(CantoParser.VarContext ctx) {
        var value = currentScope.resolve(ctx.ID().getText());

        if (value instanceof ListSymbol) {
            System.out.println("In here handling list");

            var list = value.getValue();

            return (List) list;
        }

        if (value == null) {
            System.out.println("Variable is not defined!");
            return null;
        }

        if (value.getValue() instanceof Integer) {
            return Integer.valueOf(value.getValue().toString());
        }

        switch (value.getType()) {
            case "int":
                return Integer.valueOf(value.getValue().toString());
            case "bool":
                return Boolean.valueOf(value.getValue().toString());
            case "string":
                return value.getValue().toString();
        }

        return null;
    }

}
