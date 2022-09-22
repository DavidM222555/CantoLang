package symbols;

public class ConstSymbol extends Symbol {
    public Object value;

    public ConstSymbol(String name, String type) {
        super(name, type);
        value = null;
    }
}
