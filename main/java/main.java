
import gen.CantoLexer;
import gen.CantoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import phases.ExprPhase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class main {
    public static void main(String args[]) throws IOException {
        String inputFile = "src/ProgramTestFiles/Factorial.ct";

        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        CantoLexer lexer = new CantoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CantoParser parser = new CantoParser(tokens);

        ParseTree tree = parser.file();

        ExprPhase exprPhase = new ExprPhase();

        exprPhase.visit(tree);
    }
}
