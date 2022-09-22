package symbols;

import org.antlr.v4.runtime.tree.ParseTree;
import phases.ExprPhase;
import scopes.LocalScope;
import scopes.Scope;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
    Map<String, Symbol> params = new LinkedHashMap<>();
    Scope enclosingScope;
    Object returnValue;
    ParseTree block;

    public FunctionSymbol(String name, String returnType, Scope enclosingScope, ParseTree block) {
        super(name, returnType);
        this.enclosingScope = enclosingScope;
        this.returnValue = null;
        this.block = block;
    }

    public int paramsSize() {
        return params.size();
    }


    public Symbol resolve(String name) {
        Symbol s = params.get(name);

        if (s != null) {
            return s;
        }

        if (getEnclosingScope() != null) {
            return getEnclosingScope().resolve(name);
        }

        return null;
    }

    public void define(Symbol sym) {
        System.out.println("Defining: " + sym.name);
        params.put(sym.name, sym);
        sym.scope = this;
    }

    public Scope getEnclosingScope() { return enclosingScope; }
    public String getScopeName() { return name; }

    public String toString() {
        return "function"+super.toString()+":"+params.values();
    }
}
