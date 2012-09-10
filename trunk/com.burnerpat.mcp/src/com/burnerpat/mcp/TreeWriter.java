// $ANTLR 3.4 C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g 2012-09-06 10:12:18

	package com.burnerpat.mcp;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TreeWriter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CALL", "COMMAND", "DIGIT", "FUNCTION", "ID", "LETTER", "NEGATE", "NUMBER", "PARAMETERS", "VARIABLE", "WS", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'^'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int ASSIGN=4;
    public static final int CALL=5;
    public static final int COMMAND=6;
    public static final int DIGIT=7;
    public static final int FUNCTION=8;
    public static final int ID=9;
    public static final int LETTER=10;
    public static final int NEGATE=11;
    public static final int NUMBER=12;
    public static final int PARAMETERS=13;
    public static final int VARIABLE=14;
    public static final int WS=15;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TreeWriter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TreeWriter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TreeWriter.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g"; }






    // $ANTLR start "expression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:20:1: expression returns [String result] : ( ^(o= addOp a= expression b= expression ) | ^(o= mulOp a= followUpExpr b= followUpExpr ) | NUMBER | ^( VARIABLE ID ) | functionCall );
    public final String expression() throws RecognitionException {
        String result = null;


        CommonTree NUMBER1=null;
        CommonTree ID2=null;
        String o =null;

        String a =null;

        String b =null;

        String functionCall3 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:21:2: ( ^(o= addOp a= expression b= expression ) | ^(o= mulOp a= followUpExpr b= followUpExpr ) | NUMBER | ^( VARIABLE ID ) | functionCall )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
            case 22:
                {
                alt1=1;
                }
                break;
            case 16:
            case 19:
            case 23:
            case 25:
                {
                alt1=2;
                }
                break;
            case NUMBER:
                {
                alt1=3;
                }
                break;
            case VARIABLE:
                {
                alt1=4;
                }
                break;
            case CALL:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:22:2: ^(o= addOp a= expression b= expression )
                    {
                    pushFollow(FOLLOW_addOp_in_expression61);
                    o=addOp();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression65);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression69);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = a + o + b;

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:23:4: ^(o= mulOp a= followUpExpr b= followUpExpr )
                    {
                    pushFollow(FOLLOW_mulOp_in_expression80);
                    o=mulOp();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followUpExpr_in_expression84);
                    a=followUpExpr();

                    state._fsp--;


                    pushFollow(FOLLOW_followUpExpr_in_expression88);
                    b=followUpExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = a + o + b;

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:24:4: NUMBER
                    {
                    NUMBER1=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expression96); 

                    result = (NUMBER1!=null?NUMBER1.getText():null);

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:25:4: ^( VARIABLE ID )
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_expression104); 

                    match(input, Token.DOWN, null); 
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expression106); 

                    match(input, Token.UP, null); 


                    result = (ID2!=null?ID2.getText():null);

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:26:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_expression114);
                    functionCall3=functionCall();

                    state._fsp--;


                    result = functionCall3;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "expression"



    // $ANTLR start "followUpExpr"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:29:1: followUpExpr returns [String result] : ( ^(o= addOp a= expression b= expression ) | ^(o= mulOp a= followUpExpr b= followUpExpr ) | NUMBER | ^( VARIABLE ID ) | functionCall );
    public final String followUpExpr() throws RecognitionException {
        String result = null;


        CommonTree NUMBER4=null;
        CommonTree ID5=null;
        String o =null;

        String a =null;

        String b =null;

        String functionCall6 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:30:2: ( ^(o= addOp a= expression b= expression ) | ^(o= mulOp a= followUpExpr b= followUpExpr ) | NUMBER | ^( VARIABLE ID ) | functionCall )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
            case 22:
                {
                alt2=1;
                }
                break;
            case 16:
            case 19:
            case 23:
            case 25:
                {
                alt2=2;
                }
                break;
            case NUMBER:
                {
                alt2=3;
                }
                break;
            case VARIABLE:
                {
                alt2=4;
                }
                break;
            case CALL:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:31:2: ^(o= addOp a= expression b= expression )
                    {
                    pushFollow(FOLLOW_addOp_in_followUpExpr133);
                    o=addOp();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_followUpExpr137);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_followUpExpr141);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = "(" + a + o + b + ")";

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:32:4: ^(o= mulOp a= followUpExpr b= followUpExpr )
                    {
                    pushFollow(FOLLOW_mulOp_in_followUpExpr152);
                    o=mulOp();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followUpExpr_in_followUpExpr156);
                    a=followUpExpr();

                    state._fsp--;


                    pushFollow(FOLLOW_followUpExpr_in_followUpExpr160);
                    b=followUpExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = a + o + b;

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:33:4: NUMBER
                    {
                    NUMBER4=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_followUpExpr168); 

                    result = (NUMBER4!=null?NUMBER4.getText():null);

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:34:4: ^( VARIABLE ID )
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_followUpExpr176); 

                    match(input, Token.DOWN, null); 
                    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_followUpExpr178); 

                    match(input, Token.UP, null); 


                    result = (ID5!=null?ID5.getText():null);

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:35:4: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_followUpExpr186);
                    functionCall6=functionCall();

                    state._fsp--;


                    result = functionCall6;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "followUpExpr"



    // $ANTLR start "mulOp"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:38:1: mulOp returns [String value] : ( '*' | '/' | '%' | '^' );
    public final String mulOp() throws RecognitionException {
        String value = null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:43:2: ( '*' | '/' | '%' | '^' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:44:2: '*'
                    {
                    match(input,19,FOLLOW_19_in_mulOp207); 

                    value = "*";

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:45:4: '/'
                    {
                    match(input,23,FOLLOW_23_in_mulOp214); 

                    value = "/";

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:46:4: '%'
                    {
                    match(input,16,FOLLOW_16_in_mulOp221); 

                    value = "%";

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:47:4: '^'
                    {
                    match(input,25,FOLLOW_25_in_mulOp228); 

                    value = "^";

                    }
                    break;

            }

            	value = " " + value + " ";

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "mulOp"



    // $ANTLR start "addOp"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:50:1: addOp returns [String value] : ( '+' | '-' );
    public final String addOp() throws RecognitionException {
        String value = null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:55:2: ( '+' | '-' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:56:2: '+'
                    {
                    match(input,20,FOLLOW_20_in_addOp249); 

                    value = "+";

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:57:4: '-'
                    {
                    match(input,22,FOLLOW_22_in_addOp256); 

                    value = "-";

                    }
                    break;

            }

            	value = " " + value + " ";

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "addOp"



    // $ANTLR start "functionCall"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:60:1: functionCall returns [String result] : ^( CALL ID ( parameters )? ) ;
    public final String functionCall() throws RecognitionException {
        String result = null;


        CommonTree ID7=null;
        String parameters8 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:61:2: ( ^( CALL ID ( parameters )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:62:2: ^( CALL ID ( parameters )? )
            {
            match(input,CALL,FOLLOW_CALL_in_functionCall273); 

            match(input, Token.DOWN, null); 
            ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_functionCall275); 

            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:62:12: ( parameters )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PARAMETERS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:62:12: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_functionCall277);
                    parameters8=parameters();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



            		result = (ID7!=null?ID7.getText():null) + "(";
            		result += (parameters8 != null) ? (parameters8) : "";
            		result += ")";
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "parameters"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:70:1: parameters returns [String result] : ^( PARAMETERS (p= expression )+ ) ;
    public final String parameters() throws RecognitionException {
        String result = null;


        String p =null;



        	result = null;

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:75:2: ( ^( PARAMETERS (p= expression )+ ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:76:2: ^( PARAMETERS (p= expression )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_parameters302); 

            match(input, Token.DOWN, null); 
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:76:15: (p= expression )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CALL||LA6_0==NUMBER||LA6_0==VARIABLE||LA6_0==16||(LA6_0 >= 19 && LA6_0 <= 20)||(LA6_0 >= 22 && LA6_0 <= 23)||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\TreeWriter.g:76:16: p= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_parameters307);
            	    p=expression();

            	    state._fsp--;



            	    		if (result != null)
            	    		{
            	    			result += ", " + p;
            	    		}
            	    		else
            	    		{
            	    			result = p;
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "parameters"

    // Delegated rules


 

    public static final BitSet FOLLOW_addOp_in_expression61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression65 = new BitSet(new long[]{0x0000000002D95020L});
    public static final BitSet FOLLOW_expression_in_expression69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mulOp_in_expression80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followUpExpr_in_expression84 = new BitSet(new long[]{0x0000000002D95020L});
    public static final BitSet FOLLOW_followUpExpr_in_expression88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_expression96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_expression104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionCall_in_expression114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addOp_in_followUpExpr133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_followUpExpr137 = new BitSet(new long[]{0x0000000002D95020L});
    public static final BitSet FOLLOW_expression_in_followUpExpr141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mulOp_in_followUpExpr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followUpExpr_in_followUpExpr156 = new BitSet(new long[]{0x0000000002D95020L});
    public static final BitSet FOLLOW_followUpExpr_in_followUpExpr160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_followUpExpr168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_followUpExpr176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_followUpExpr178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionCall_in_followUpExpr186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_mulOp207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_mulOp214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_mulOp221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_mulOp228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_addOp249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_addOp256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_functionCall273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_functionCall275 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_parameters_in_functionCall277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_parameters302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parameters307 = new BitSet(new long[]{0x0000000002D95028L});

}