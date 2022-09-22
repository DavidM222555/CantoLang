package phases;

import com.sun.jdi.Value;
import functions.Function;
import functions.ReturnValue;
import gen.CantoBaseVisitor;
import gen.CantoParser;
import scopes.GlobalScope;
import scopes.LocalScope;
import scopes.Scope;
import symbols.FunctionSymbol;
import symbols.VarSymbol;

import java.util.*;

public class ExprPhase extends CantoBaseVisitor {
    GlobalScope globals;
    Scope currentScope;

    static ReturnValue retvalue = new ReturnValue();

    Map<String, Function> functions = new HashMap<>();

    public ExprPhase() {}

    public ExprPhase(Scope currentScope, Map<String, Function> functions) {
        this.currentScope = currentScope;
        this.functions = functions;
    }


    public Integer visitFile(CantoParser.FileContext ctx) {
        this.globals = new GlobalScope(null);
        this.currentScope = globals;

        visitChildren(ctx);

        System.out.println("Program executed successfully!");

        return 0;
    }


    public Value visitStatement(CantoParser.StatementContext ctx) {
        visitChildren(ctx);

        return null;
    }

    public Value visitVarDecl(CantoParser.VarDeclContext ctx) {
        visitChildren(ctx);

        return null;
    }

    public Value visitAssign(CantoParser.AssignContext ctx) {
        var variableToChangeName = currentScope.resolve(ctx.ID().getText());
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

    public Object visitReturn(CantoParser.ReturnContext ctx) {
        System.out.println("Attempting to return");

        Object returnObject = visit(ctx.expr());

        retvalue.value = returnObject;

        throw retvalue;
    }

    public Value visitBlock(CantoParser.BlockContext ctx) {
        // Create a new scope for the block
        currentScope = new LocalScope(currentScope);

        visitChildren(ctx);

        currentScope = currentScope.getEnclosingScope();

        return null;
    }

    public Object visitPrint(CantoParser.PrintContext ctx) {
        var result = visit(ctx.expr());

        System.out.println(result.toString());

        return null;
    }


    public Value visitWhile(CantoParser.WhileContext ctx) {

        boolean condition = Boolean.parseBoolean(visit(ctx.expr()).toString());

        while (condition) {
            visit(ctx.block());

            condition = Boolean.parseBoolean(visit(ctx.expr()).toString());
        }

        return null;
    }

    public Object visitUntil(CantoParser.UntilContext ctx) {
        boolean condition = Boolean.parseBoolean(visit(ctx.expr()).toString());

        while (!condition) {
            visit(ctx.block());

            condition = Boolean.parseBoolean(visit(ctx.expr()).toString());
        }

        return null;
    }

    public Object visitFuncDecl(CantoParser.FuncDeclContext ctx) {
        System.out.println("Defining function");

        String funcName = ctx.ID().getText();

        List<VarSymbol> params = new ArrayList<>();

        var argList = visitArgList(ctx.argList());

        for(int i = 0; i < argList.size(); i++) {
            System.out.println(argList.get(i).getName());
        }

        // Define the new function and put it in our functions map
        Function newFunction = new Function(currentScope, argList, ctx.block());
        functions.put(funcName, newFunction);

        return null;
    }

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

    public Object visitCall(CantoParser.CallContext ctx) {
        if (!functions.containsKey(ctx.ID().getText())) {
            System.out.println("Function not defined");
        }

        var functionToCall = functions.get(ctx.ID().getText());
        var params = visitExprList(ctx.exprList());

        var funcReturn = functionToCall.invoke(params, functions);

        return funcReturn;
    }

    public List<Object> visitExprList(CantoParser.ExprListContext ctx) {
        List<Object> exprList = new ArrayList<>();

        for (int i = 0; i < ctx.expr().size(); i++) {
            var exprToAdd = visit(ctx.expr(i));

            System.out.println("Expression we are adding: " + exprToAdd.toString());

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

    public Integer visitMod(CantoParser.ModContext ctx) {
        var leftSide = visit(ctx.expr(0));
        var rightSide = visit(ctx.expr(1));

        if (!(leftSide instanceof Integer)) {
            System.out.println("Modulus must have integer arguments");
        }

        if (!(rightSide instanceof Integer)) {
            System.out.println("Modulus must have integer arguments");
        }

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

    public Object visitVar(CantoParser.VarContext ctx) {
        var value = currentScope.resolve(ctx.ID().getText());

        if (value == null) {
            System.out.println("Variable is not defined!");
            return null;
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
