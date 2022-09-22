package scopes;

import symbols.Symbol;

import java.util.LinkedHashMap;
import java.util.Map;

// Largely derived from 'The Definitive ANTLR 4 Reference'
public abstract class BaseScope implements Scope {
    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<>();

    public BaseScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    public void printSymbols(){
        for(var entry : symbols.keySet()) {
            System.out.println(entry.toString());
        }
    }

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);

        if (s != null) {
            return s;
        }

        if (enclosingScope != null) return enclosingScope.resolve(name);

        return null;
    }

    public void define(Symbol sym) {
        symbols.put(sym.getName(), sym);
        sym.setScope(this);
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        return getScopeName() + ":" + symbols.keySet().toString();
    }
}
