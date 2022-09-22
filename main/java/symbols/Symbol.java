package symbols;

import com.sun.jdi.Value;
import scopes.Scope;
import types.Type;

// Code was inspired by "The Definitive ANTLR 4 Reference"
// guide's code for a symbols.Symbol class
public class Symbol {
    String name;
    String type;
    Scope scope;
    Object objValue;

    public Symbol(String name, String type) {
        this.name = name;
        this.type = type;
        this.scope = null;
    }

    public void setScope(Scope scopeToSet) {
        this.scope = scopeToSet;
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public Object getValue() {
        return objValue;
    }

    public void setObjectValue(Object valToSet) {
        this.objValue = valToSet;
    }
}
