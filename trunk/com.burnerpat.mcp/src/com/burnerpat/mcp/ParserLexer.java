// $ANTLR 3.4 C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g 2012-09-10 10:10:52

  package com.burnerpat.mcp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int ASSIGN=4;
    public static final int CALL=5;
    public static final int COMMAND=6;
    public static final int DIGIT=7;
    public static final int FUNCTION=8;
    public static final int ID=9;
    public static final int INDEX=10;
    public static final int LETTER=11;
    public static final int NEGATE=12;
    public static final int NUMBER=13;
    public static final int PARAMETERS=14;
    public static final int VARIABLE=15;
    public static final int WS=16;

        @Override
        public void reportError(RecognitionException e) {
            throw new RuntimeException(e);
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ParserLexer() {} 
    public ParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:17:7: ( '%' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:17:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:18:7: ( '(' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:19:7: ( ')' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:20:7: ( '*' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:20:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:21:7: ( '+' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:22:7: ( ',' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:23:7: ( '-' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:23:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:24:7: ( '/' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:25:7: ( '=' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:26:7: ( '[' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:27:7: ( ']' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:28:7: ( '^' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:28:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:59:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:59:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:67:2: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? | '.' ( DIGIT )+ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='.') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:68:2: ( DIGIT )+ ( '.' ( DIGIT )+ )?
                    {
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:68:2: ( DIGIT )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:68:9: ( '.' ( DIGIT )+ )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:68:10: '.' ( DIGIT )+
                            {
                            match('.'); 

                            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:68:14: ( DIGIT )+
                            int cnt2=0;
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt2 >= 1 ) break loop2;
                                        EarlyExitException eee =
                                            new EarlyExitException(2, input);
                                        throw eee;
                                }
                                cnt2++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:69:2: '.' ( DIGIT )+
                    {
                    match('.'); 

                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:69:6: ( DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:73:2: ( '0' .. '9' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:78:2: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:79:2: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:79:17: ( LETTER | DIGIT | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:83:2: ( 'A' .. 'Z' | 'a' .. 'z' )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | WS | NUMBER | ID )
        int alt7=15;
        switch ( input.LA(1) ) {
        case '%':
            {
            alt7=1;
            }
            break;
        case '(':
            {
            alt7=2;
            }
            break;
        case ')':
            {
            alt7=3;
            }
            break;
        case '*':
            {
            alt7=4;
            }
            break;
        case '+':
            {
            alt7=5;
            }
            break;
        case ',':
            {
            alt7=6;
            }
            break;
        case '-':
            {
            alt7=7;
            }
            break;
        case '/':
            {
            alt7=8;
            }
            break;
        case '=':
            {
            alt7=9;
            }
            break;
        case '[':
            {
            alt7=10;
            }
            break;
        case ']':
            {
            alt7=11;
            }
            break;
        case '^':
            {
            alt7=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=13;
            }
            break;
        case '.':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=14;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=15;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:16: T__18
                {
                mT__18(); 


                }
                break;
            case 3 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:22: T__19
                {
                mT__19(); 


                }
                break;
            case 4 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:28: T__20
                {
                mT__20(); 


                }
                break;
            case 5 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:34: T__21
                {
                mT__21(); 


                }
                break;
            case 6 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:40: T__22
                {
                mT__22(); 


                }
                break;
            case 7 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:46: T__23
                {
                mT__23(); 


                }
                break;
            case 8 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:52: T__24
                {
                mT__24(); 


                }
                break;
            case 9 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:58: T__25
                {
                mT__25(); 


                }
                break;
            case 10 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:64: T__26
                {
                mT__26(); 


                }
                break;
            case 11 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:70: T__27
                {
                mT__27(); 


                }
                break;
            case 12 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:76: T__28
                {
                mT__28(); 


                }
                break;
            case 13 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:82: WS
                {
                mWS(); 


                }
                break;
            case 14 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:85: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 15 :
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:1:92: ID
                {
                mID(); 


                }
                break;

        }

    }


 

}