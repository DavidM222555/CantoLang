package symbols;

import java.util.List;

public class ListSymbol extends VarSymbol {
    public String listType;
    public List<Object> values;

    public ListSymbol(String name, String type, String listType, List<Object> values) {
        super(name, type);
        this.listType = listType;
        this.values = values;
    }
}
