package functions;

// Scheme taken from the following Github:
// https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/java/tl/antlr4/ReturnValue.java
// Investigating whether there is a more ... clean way of implementing returns
// to break out of functions early and yield their value
public class ReturnValue extends RuntimeException{
    public Object value;
}
