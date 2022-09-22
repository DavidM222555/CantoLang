package functions;

import org.antlr.v4.runtime.tree.ParseTree;
import phases.ExprPhase;
import scopes.BaseScope;
import scopes.LocalScope;
import scopes.Scope;
import symbols.Symbol;
import symbols.VarSymbol;

import java.util.List;
import java.util.Map;

// Adapted from code found on the following Github:
// https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/java/tl/antlr4/Function.java
public class Function {
    public Scope enclosingScope;
    public List<VarSymbol> params;
    public ParseTree block;

    public Function(Scope enclosingScope, List<VarSymbol> params, ParseTree block) {
        this.enclosingScope = enclosingScope;
        this.params = params;
        this.block = block;
    }

    public Object invoke(List<Object> args, Map<String, Function> functions) {
        if (args.size() != params.size()) {
            System.out.println("Incorrect number of arguments!");
        }

        Scope funcScope = new LocalScope(enclosingScope);

        for (int i = 0; i < params.size(); i++) {
            VarSymbol value = new VarSymbol(params.get(i).getName(), params.get(i).getType());

            System.out.println("Object value: " + args.get(i));

            value.setObjectValue(args.get(i));

            funcScope.define(value);
        }

        ExprPhase funcCallVisitor = new ExprPhase(funcScope, functions);

        Object returnValue = null;

        try {
            funcCallVisitor.visit(block);
        } catch (ReturnValue ret) {
            System.out.println("Returning now!");
            returnValue = ret.value;
        }

        return returnValue;
    }

}
