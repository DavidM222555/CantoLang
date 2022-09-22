package scopes;

import symbols.Symbol;

// Taken from 'The Definitive ANTLR 4 Reference'
public interface Scope {
    String getScopeName();

    Scope getEnclosingScope();

    void define(Symbol sym);

    Symbol resolve(String name);
}
