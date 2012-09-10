import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.burnerpat.mcp.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ParserLexer lex = new ParserLexer(new ANTLRFileStream("C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ParserParser g = new ParserParser(tokens, 49100, null);
        try {
            g.statement();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}