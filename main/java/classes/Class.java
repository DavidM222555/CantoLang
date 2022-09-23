package classes;

import functions.Function;
import symbols.VarSymbol;

import java.util.HashMap;
import java.util.Map;

public class Class {
    private Map<String, Function> publicMethods;
    private Map<String, Function> privateMethods;
    private Map<String, Object> publicMembers;
    private Map<String, Object> privateMembers;

    public Class() {
        publicMethods = new HashMap<>();
        privateMethods = new HashMap<>();

        publicMembers = new HashMap<>();
        privateMembers = new HashMap<>();
    }

    public void definePublicMethod(String name, Function funcToAdd) {
        publicMethods.put(name, funcToAdd);
    }

    public void definePrivateMethod(String name, Function funcToAdd) {
        privateMethods.put(name, funcToAdd);
    }

    public void definePublicMember(String name, Object var) {
        publicMembers.put(name, var);
    }

    public void definePrivateMember(String name, Object var) {
        privateMembers.put(name, var);
    }

    public Function getPublicMethod(String name) {
        return publicMethods.get(name);
    }

    public Function getPrivateMethod(String name) {
        return privateMethods.get(name);
    }

}
