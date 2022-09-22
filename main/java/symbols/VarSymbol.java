package symbols;

import types.Type;

public class VarSymbol extends Symbol {
    public Object value;
    public String type;

    public VarSymbol(String name, String type) {
        super(name, type);
        value = null;
    }
}
