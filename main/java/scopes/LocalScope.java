package scopes;

// Largely taken from 'The Definitive ANTLR 4 Reference"
public class LocalScope extends BaseScope {
    public LocalScope(Scope parent) {
        super(parent);
    }

    public String getScopeName() {
        return "Local scope";
    }

}
