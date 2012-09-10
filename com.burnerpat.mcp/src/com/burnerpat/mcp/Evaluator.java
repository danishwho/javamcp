// $ANTLR 3.4 C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g 2012-09-10 11:09:24

	package com.burnerpat.mcp;
	
	import java.util.HashSet;
	import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Evaluator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CALL", "COMMAND", "DIGIT", "FUNCTION", "ID", "INDEX", "LETTER", "NEGATE", "NUMBER", "PARAMETERS", "VARIABLE", "WS", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'['", "']'", "'^'"
    };

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

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public Evaluator(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Evaluator(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Evaluator.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g"; }


    	Memory memory = Memory.getInstance();
    	Environment env = Environment.getInstance();



    // $ANTLR start "statement"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:24:1: statement returns [boolean wasExpression] : ( expression | assignment | command );
    public final boolean statement() throws RecognitionException {
        boolean wasExpression = false;



        	wasExpression = false;

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:29:2: ( expression | assignment | command )
            int alt1=3;
            switch ( input.LA(1) ) {
            case CALL:
            case NEGATE:
            case NUMBER:
            case VARIABLE:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 28:
                {
                alt1=1;
                }
                break;
            case ASSIGN:
                {
                alt1=2;
                }
                break;
            case COMMAND:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:30:2: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement63);
                    expression();

                    state._fsp--;


                    wasExpression = true;

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:31:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement70);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:32:4: command
                    {
                    pushFollow(FOLLOW_command_in_statement75);
                    command();

                    state._fsp--;


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
        return wasExpression;
    }
    // $ANTLR end "statement"


    public static class expression_return extends TreeRuleReturnScope {
        public double value;
    };


    // $ANTLR start "expression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:35:1: expression returns [double value] : ( ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | NUMBER | ^( NEGATE a= expression ) | ^( VARIABLE ID ) | ^( VARIABLE ID index ) | ^( CALL ID ( parameters )? ) );
    public final Evaluator.expression_return expression() throws RecognitionException {
        Evaluator.expression_return retval = new Evaluator.expression_return();
        retval.start = input.LT(1);


        CommonTree NUMBER1=null;
        CommonTree ID2=null;
        CommonTree ID3=null;
        CommonTree ID5=null;
        Evaluator.expression_return a =null;

        Evaluator.expression_return b =null;

        int index4 =0;

        ArrayList<Double> parameters6 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:40:2: ( ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | NUMBER | ^( NEGATE a= expression ) | ^( VARIABLE ID ) | ^( VARIABLE ID index ) | ^( CALL ID ( parameters )? ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case NUMBER:
                {
                alt3=7;
                }
                break;
            case NEGATE:
                {
                alt3=8;
                }
                break;
            case VARIABLE:
                {
                int LA3_9 = input.LA(2);

                if ( (LA3_9==DOWN) ) {
                    int LA3_11 = input.LA(3);

                    if ( (LA3_11==ID) ) {
                        int LA3_12 = input.LA(4);

                        if ( (LA3_12==UP) ) {
                            alt3=9;
                        }
                        else if ( (LA3_12==INDEX) ) {
                            alt3=10;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 9, input);

                    throw nvae;

                }
                }
                break;
            case CALL:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:41:2: ^( '+' a= expression b= expression )
                    {
                    match(input,21,FOLLOW_21_in_expression95); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression99);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression103);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = (a!=null?a.value:0.0) + (b!=null?b.value:0.0);

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:42:4: ^( '-' a= expression b= expression )
                    {
                    match(input,23,FOLLOW_23_in_expression112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression116);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression120);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = (a!=null?a.value:0.0) - (b!=null?b.value:0.0);

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:43:4: ^( '*' a= expression b= expression )
                    {
                    match(input,20,FOLLOW_20_in_expression129); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression133);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression137);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = (a!=null?a.value:0.0) * (b!=null?b.value:0.0);

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:44:4: ^( '/' a= expression b= expression )
                    {
                    match(input,24,FOLLOW_24_in_expression146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression150);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression154);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = (a!=null?a.value:0.0) / (b!=null?b.value:0.0);

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:45:4: ^( '%' a= expression b= expression )
                    {
                    match(input,17,FOLLOW_17_in_expression163); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression167);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression171);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = (a!=null?a.value:0.0) % (b!=null?b.value:0.0);

                    }
                    break;
                case 6 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:46:4: ^( '^' a= expression b= expression )
                    {
                    match(input,28,FOLLOW_28_in_expression180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression184);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression188);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = Math.pow((a!=null?a.value:0.0), (b!=null?b.value:0.0));

                    }
                    break;
                case 7 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:47:4: NUMBER
                    {
                    NUMBER1=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expression196); 

                    retval.value = Double.parseDouble((NUMBER1!=null?NUMBER1.getText():null));

                    }
                    break;
                case 8 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:48:4: ^( NEGATE a= expression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expression204); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression208);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = -(a!=null?a.value:0.0);

                    }
                    break;
                case 9 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:49:4: ^( VARIABLE ID )
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_expression217); 

                    match(input, Token.DOWN, null); 
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expression219); 

                    match(input, Token.UP, null); 


                    retval.value = memory.getVariable((ID2!=null?ID2.getText():null));

                    }
                    break;
                case 10 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:50:4: ^( VARIABLE ID index )
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_expression228); 

                    match(input, Token.DOWN, null); 
                    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expression230); 

                    pushFollow(FOLLOW_index_in_expression232);
                    index4=index();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.value = memory.getVariable((ID3!=null?ID3.getText():null), index4);

                    }
                    break;
                case 11 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:51:4: ^( CALL ID ( parameters )? )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expression241); 

                    match(input, Token.DOWN, null); 
                    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_expression243); 

                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:51:14: ( parameters )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==PARAMETERS) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:51:14: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_expression245);
                            parameters6=parameters();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    retval.value = memory.callFunction((ID5!=null?ID5.getText():null), parameters6);

                    }
                    break;

            }

            	memory.setResult(retval.value);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "parameters"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:54:1: parameters returns [ArrayList<Double> result] : ^( PARAMETERS (p= expression )+ ) ;
    public final ArrayList<Double> parameters() throws RecognitionException {
        ArrayList<Double> result = null;


        Evaluator.expression_return p =null;



        	result = new ArrayList<Double>();

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:59:2: ( ^( PARAMETERS (p= expression )+ ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:60:2: ^( PARAMETERS (p= expression )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_parameters269); 

            match(input, Token.DOWN, null); 
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:60:15: (p= expression )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CALL||(LA4_0 >= NEGATE && LA4_0 <= NUMBER)||LA4_0==VARIABLE||LA4_0==17||(LA4_0 >= 20 && LA4_0 <= 21)||(LA4_0 >= 23 && LA4_0 <= 24)||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:60:16: p= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_parameters274);
            	    p=expression();

            	    state._fsp--;


            	    result.add(new Double((p!=null?p.value:0.0)));

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



    // $ANTLR start "index"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:63:1: index returns [int result] : ^( INDEX NUMBER ) ;
    public final int index() throws RecognitionException {
        int result = 0;


        CommonTree NUMBER7=null;


        	result = -1;

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:68:2: ( ^( INDEX NUMBER ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:69:2: ^( INDEX NUMBER )
            {
            match(input,INDEX,FOLLOW_INDEX_in_index299); 

            match(input, Token.DOWN, null); 
            NUMBER7=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_index301); 

            match(input, Token.UP, null); 


            result = Integer.parseInt((NUMBER7!=null?NUMBER7.getText():null));

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
    // $ANTLR end "index"



    // $ANTLR start "assignment"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:72:1: assignment : ( ^( ASSIGN ^( VARIABLE ID ) expression ) | ^( ASSIGN ^( VARIABLE ID index ) expression ) | ^( ASSIGN ^( FUNCTION ID ( paramDef )? ) expression ) );
    public final void assignment() throws RecognitionException {
        CommonTree ID8=null;
        CommonTree ID10=null;
        CommonTree ID13=null;
        Evaluator.expression_return expression9 =null;

        int index11 =0;

        Evaluator.expression_return expression12 =null;

        HashSet<String> paramDef14 =null;

        Evaluator.expression_return expression15 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:73:2: ( ^( ASSIGN ^( VARIABLE ID ) expression ) | ^( ASSIGN ^( VARIABLE ID index ) expression ) | ^( ASSIGN ^( FUNCTION ID ( paramDef )? ) expression ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ASSIGN) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DOWN) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==VARIABLE) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==DOWN) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==ID) ) {
                                int LA6_6 = input.LA(6);

                                if ( (LA6_6==UP) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_6==INDEX) ) {
                                    alt6=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 6, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA6_2==FUNCTION) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:74:2: ^( ASSIGN ^( VARIABLE ID ) expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment317); 

                    match(input, Token.DOWN, null); 
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_assignment320); 

                    match(input, Token.DOWN, null); 
                    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment322); 

                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expression_in_assignment325);
                    expression9=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    memory.setVariable((ID8!=null?ID8.getText():null), -1, (expression9!=null?((CommonTree)expression9.start):null));

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:75:4: ^( ASSIGN ^( VARIABLE ID index ) expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment334); 

                    match(input, Token.DOWN, null); 
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_assignment337); 

                    match(input, Token.DOWN, null); 
                    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment339); 

                    pushFollow(FOLLOW_index_in_assignment341);
                    index11=index();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expression_in_assignment344);
                    expression12=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    memory.setVariable((ID10!=null?ID10.getText():null), index11, (expression12!=null?((CommonTree)expression12.start):null));

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:76:4: ^( ASSIGN ^( FUNCTION ID ( paramDef )? ) expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment353); 

                    match(input, Token.DOWN, null); 
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_assignment356); 

                    match(input, Token.DOWN, null); 
                    ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment358); 

                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:76:27: ( paramDef )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==PARAMETERS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:76:27: paramDef
                            {
                            pushFollow(FOLLOW_paramDef_in_assignment360);
                            paramDef14=paramDef();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_expression_in_assignment364);
                    expression15=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    memory.setFunction((ID13!=null?ID13.getText():null), paramDef14, (expression15!=null?((CommonTree)expression15.start):null));

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
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "paramDef"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:79:1: paramDef returns [HashSet<String> result] : ^( PARAMETERS (p= ID )+ ) ;
    public final HashSet<String> paramDef() throws RecognitionException {
        HashSet<String> result = null;


        CommonTree p=null;


        	result = new HashSet<String>();

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:84:2: ( ^( PARAMETERS (p= ID )+ ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:85:2: ^( PARAMETERS (p= ID )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_paramDef387); 

            match(input, Token.DOWN, null); 
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:85:15: (p= ID )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:85:16: p= ID
            	    {
            	    p=(CommonTree)match(input,ID,FOLLOW_ID_in_paramDef392); 

            	    result.add((p!=null?p.getText():null));

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "paramDef"



    // $ANTLR start "command"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:88:1: command : ^( COMMAND ID ( commandParams )? ) ;
    public final void command() throws RecognitionException {
        CommonTree ID16=null;
        ArrayList<String> commandParams17 =null;


        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:89:2: ( ^( COMMAND ID ( commandParams )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:90:2: ^( COMMAND ID ( commandParams )? )
            {
            match(input,COMMAND,FOLLOW_COMMAND_in_command408); 

            match(input, Token.DOWN, null); 
            ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_command410); 

            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:90:15: ( commandParams )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PARAMETERS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:90:15: commandParams
                    {
                    pushFollow(FOLLOW_commandParams_in_command412);
                    commandParams17=commandParams();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            env.command((ID16!=null?ID16.getText():null), commandParams17);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "command"



    // $ANTLR start "commandParams"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:93:1: commandParams returns [ArrayList<String> result] : ^( PARAMETERS (p= ID )+ ) ;
    public final ArrayList<String> commandParams() throws RecognitionException {
        ArrayList<String> result = null;


        CommonTree p=null;


        	result = new ArrayList<String>();

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:98:2: ( ^( PARAMETERS (p= ID )+ ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:99:2: ^( PARAMETERS (p= ID )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_commandParams436); 

            match(input, Token.DOWN, null); 
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:99:15: (p= ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Evaluator.g:99:16: p= ID
            	    {
            	    p=(CommonTree)match(input,ID,FOLLOW_ID_in_commandParams441); 

            	    result.add((p!=null?p.getText():null));

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "commandParams"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_statement63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression99 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expression112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression116 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_expression129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression133 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expression146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression150 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_17_in_expression163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression167 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expression180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression184 = new BitSet(new long[]{0x0000000011B2B020L});
    public static final BitSet FOLLOW_expression_in_expression188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_expression196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATE_in_expression204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_expression217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_in_expression228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression230 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_index_in_expression232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_expression241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expression243 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_parameters_in_expression245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_parameters269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parameters274 = new BitSet(new long[]{0x0000000011B2B028L});
    public static final BitSet FOLLOW_INDEX_in_index299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_index301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLE_in_assignment320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VARIABLE_in_assignment337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment339 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_index_in_assignment341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FUNCTION_in_assignment356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment358 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_paramDef_in_assignment360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_paramDef387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_paramDef392 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_COMMAND_in_command408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_command410 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_commandParams_in_command412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_commandParams436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_commandParams441 = new BitSet(new long[]{0x0000000000000208L});

}