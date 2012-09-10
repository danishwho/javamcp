// $ANTLR 3.4 C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g 2012-09-10 10:10:52

	package com.burnerpat.mcp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ParserParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g"; }



      @Override
      protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
      }

      @Override
      public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
        throw e;
      }


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:87:1: statement : ( expression | assignment | command );
    public final ParserParser.statement_return statement() throws RecognitionException {
        ParserParser.statement_return retval = new ParserParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ParserParser.expression_return expression1 =null;

        ParserParser.assignment_return assignment2 =null;

        ParserParser.command_return command3 =null;



        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:88:2: ( expression | assignment | command )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:89:2: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_statement267);
                    expression1=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:90:2: assignment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_in_statement272);
                    assignment2=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment2.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:91:2: command
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_command_in_statement277);
                    command3=command();

                    state._fsp--;

                    adaptor.addChild(root_0, command3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:94:1: expression : addExpression ;
    public final ParserParser.expression_return expression() throws RecognitionException {
        ParserParser.expression_return retval = new ParserParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ParserParser.addExpression_return addExpression4 =null;



        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:95:2: ( addExpression )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:96:2: addExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpression_in_expression288);
            addExpression4=addExpression();

            state._fsp--;

            adaptor.addChild(root_0, addExpression4.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class addExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExpression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:99:1: addExpression : mulExpression ( ( '+' ^| '-' ^) mulExpression )* ;
    public final ParserParser.addExpression_return addExpression() throws RecognitionException {
        ParserParser.addExpression_return retval = new ParserParser.addExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal7=null;
        ParserParser.mulExpression_return mulExpression5 =null;

        ParserParser.mulExpression_return mulExpression8 =null;


        Object char_literal6_tree=null;
        Object char_literal7_tree=null;

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:100:2: ( mulExpression ( ( '+' ^| '-' ^) mulExpression )* )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:2: mulExpression ( ( '+' ^| '-' ^) mulExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mulExpression_in_addExpression298);
            mulExpression5=mulExpression();

            state._fsp--;

            adaptor.addChild(root_0, mulExpression5.getTree());

            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:16: ( ( '+' ^| '-' ^) mulExpression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:17: ( '+' ^| '-' ^) mulExpression
            	    {
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:17: ( '+' ^| '-' ^)
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==21) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==23) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:18: '+' ^
            	            {
            	            char_literal6=(Token)match(input,21,FOLLOW_21_in_addExpression302); 
            	            char_literal6_tree = 
            	            (Object)adaptor.create(char_literal6)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal6_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:101:25: '-' ^
            	            {
            	            char_literal7=(Token)match(input,23,FOLLOW_23_in_addExpression307); 
            	            char_literal7_tree = 
            	            (Object)adaptor.create(char_literal7)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal7_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mulExpression_in_addExpression311);
            	    mulExpression8=mulExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulExpression8.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addExpression"


    public static class mulExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mulExpression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:104:1: mulExpression : atomExpression ( ( '*' ^| '/' ^| '%' ^| '^' ^) atomExpression )* ;
    public final ParserParser.mulExpression_return mulExpression() throws RecognitionException {
        ParserParser.mulExpression_return retval = new ParserParser.mulExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Token char_literal13=null;
        ParserParser.atomExpression_return atomExpression9 =null;

        ParserParser.atomExpression_return atomExpression14 =null;


        Object char_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal13_tree=null;

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:105:2: ( atomExpression ( ( '*' ^| '/' ^| '%' ^| '^' ^) atomExpression )* )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:2: atomExpression ( ( '*' ^| '/' ^| '%' ^| '^' ^) atomExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atomExpression_in_mulExpression323);
            atomExpression9=atomExpression();

            state._fsp--;

            adaptor.addChild(root_0, atomExpression9.getTree());

            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:17: ( ( '*' ^| '/' ^| '%' ^| '^' ^) atomExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==20||LA5_0==24||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:18: ( '*' ^| '/' ^| '%' ^| '^' ^) atomExpression
            	    {
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:18: ( '*' ^| '/' ^| '%' ^| '^' ^)
            	    int alt4=4;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:19: '*' ^
            	            {
            	            char_literal10=(Token)match(input,20,FOLLOW_20_in_mulExpression327); 
            	            char_literal10_tree = 
            	            (Object)adaptor.create(char_literal10)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal10_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:26: '/' ^
            	            {
            	            char_literal11=(Token)match(input,24,FOLLOW_24_in_mulExpression332); 
            	            char_literal11_tree = 
            	            (Object)adaptor.create(char_literal11)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:33: '%' ^
            	            {
            	            char_literal12=(Token)match(input,17,FOLLOW_17_in_mulExpression337); 
            	            char_literal12_tree = 
            	            (Object)adaptor.create(char_literal12)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal12_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:106:40: '^' ^
            	            {
            	            char_literal13=(Token)match(input,28,FOLLOW_28_in_mulExpression342); 
            	            char_literal13_tree = 
            	            (Object)adaptor.create(char_literal13)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal13_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_atomExpression_in_mulExpression346);
            	    atomExpression14=atomExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atomExpression14.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mulExpression"


    public static class atomExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomExpression"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:109:1: atomExpression : ( '-' atomExpression -> ^( NEGATE atomExpression ) | NUMBER ^| variable | functionCall | '(' addExpression ')' -> addExpression );
    public final ParserParser.atomExpression_return atomExpression() throws RecognitionException {
        ParserParser.atomExpression_return retval = new ParserParser.atomExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal15=null;
        Token NUMBER17=null;
        Token char_literal20=null;
        Token char_literal22=null;
        ParserParser.atomExpression_return atomExpression16 =null;

        ParserParser.variable_return variable18 =null;

        ParserParser.functionCall_return functionCall19 =null;

        ParserParser.addExpression_return addExpression21 =null;


        Object char_literal15_tree=null;
        Object NUMBER17_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_atomExpression=new RewriteRuleSubtreeStream(adaptor,"rule atomExpression");
        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:110:2: ( '-' atomExpression -> ^( NEGATE atomExpression ) | NUMBER ^| variable | functionCall | '(' addExpression ')' -> addExpression )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case NUMBER:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==18) ) {
                    alt6=4;
                }
                else if ( (LA6_3==EOF||LA6_3==17||(LA6_3 >= 19 && LA6_3 <= 24)||LA6_3==26||LA6_3==28) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:111:2: '-' atomExpression
                    {
                    char_literal15=(Token)match(input,23,FOLLOW_23_in_atomExpression358);  
                    stream_23.add(char_literal15);


                    pushFollow(FOLLOW_atomExpression_in_atomExpression360);
                    atomExpression16=atomExpression();

                    state._fsp--;

                    stream_atomExpression.add(atomExpression16.getTree());

                    // AST REWRITE
                    // elements: atomExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:21: -> ^( NEGATE atomExpression )
                    {
                        // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:111:24: ^( NEGATE atomExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEGATE, "NEGATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_atomExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:112:4: NUMBER ^
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atomExpression374); 
                    NUMBER17_tree = 
                    (Object)adaptor.create(NUMBER17)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NUMBER17_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:113:4: variable
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_variable_in_atomExpression380);
                    variable18=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable18.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:114:4: functionCall
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_functionCall_in_atomExpression385);
                    functionCall19=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall19.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:115:4: '(' addExpression ')'
                    {
                    char_literal20=(Token)match(input,18,FOLLOW_18_in_atomExpression390);  
                    stream_18.add(char_literal20);


                    pushFollow(FOLLOW_addExpression_in_atomExpression392);
                    addExpression21=addExpression();

                    state._fsp--;

                    stream_addExpression.add(addExpression21.getTree());

                    char_literal22=(Token)match(input,19,FOLLOW_19_in_atomExpression394);  
                    stream_19.add(char_literal22);


                    // AST REWRITE
                    // elements: addExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:26: -> addExpression
                    {
                        adaptor.addChild(root_0, stream_addExpression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomExpression"


    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:118:1: assignment : ( variable '=' expression -> ^( ASSIGN variable expression ) | functionDef '=' expression -> ^( ASSIGN functionDef expression ) );
    public final ParserParser.assignment_return assignment() throws RecognitionException {
        ParserParser.assignment_return retval = new ParserParser.assignment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal24=null;
        Token char_literal27=null;
        ParserParser.variable_return variable23 =null;

        ParserParser.expression_return expression25 =null;

        ParserParser.functionDef_return functionDef26 =null;

        ParserParser.expression_return expression28 =null;


        Object char_literal24_tree=null;
        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDef=new RewriteRuleSubtreeStream(adaptor,"rule functionDef");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:119:2: ( variable '=' expression -> ^( ASSIGN variable expression ) | functionDef '=' expression -> ^( ASSIGN functionDef expression ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=2;
                }
                else if ( ((LA7_1 >= 25 && LA7_1 <= 26)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:120:2: variable '=' expression
                    {
                    pushFollow(FOLLOW_variable_in_assignment408);
                    variable23=variable();

                    state._fsp--;

                    stream_variable.add(variable23.getTree());

                    char_literal24=(Token)match(input,25,FOLLOW_25_in_assignment410);  
                    stream_25.add(char_literal24);


                    pushFollow(FOLLOW_expression_in_assignment412);
                    expression25=expression();

                    state._fsp--;

                    stream_expression.add(expression25.getTree());

                    // AST REWRITE
                    // elements: expression, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:26: -> ^( ASSIGN variable expression )
                    {
                        // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:120:29: ^( ASSIGN variable expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:121:4: functionDef '=' expression
                    {
                    pushFollow(FOLLOW_functionDef_in_assignment427);
                    functionDef26=functionDef();

                    state._fsp--;

                    stream_functionDef.add(functionDef26.getTree());

                    char_literal27=(Token)match(input,25,FOLLOW_25_in_assignment429);  
                    stream_25.add(char_literal27);


                    pushFollow(FOLLOW_expression_in_assignment431);
                    expression28=expression();

                    state._fsp--;

                    stream_expression.add(expression28.getTree());

                    // AST REWRITE
                    // elements: functionDef, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:31: -> ^( ASSIGN functionDef expression )
                    {
                        // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:121:34: ^( ASSIGN functionDef expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionDef.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:124:1: variable : ID ( index )? -> ^( VARIABLE ID ( index )? ) ;
    public final ParserParser.variable_return variable() throws RecognitionException {
        ParserParser.variable_return retval = new ParserParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID29=null;
        ParserParser.index_return index30 =null;


        Object ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_index=new RewriteRuleSubtreeStream(adaptor,"rule index");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:125:2: ( ID ( index )? -> ^( VARIABLE ID ( index )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:126:2: ID ( index )?
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_variable451);  
            stream_ID.add(ID29);


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:126:5: ( index )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:126:5: index
                    {
                    pushFollow(FOLLOW_index_in_variable453);
                    index30=index();

                    state._fsp--;

                    stream_index.add(index30.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: index, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:12: -> ^( VARIABLE ID ( index )? )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:126:15: ^( VARIABLE ID ( index )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VARIABLE, "VARIABLE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:126:29: ( index )?
                if ( stream_index.hasNext() ) {
                    adaptor.addChild(root_1, stream_index.nextTree());

                }
                stream_index.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variable"


    public static class index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "index"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:129:1: index : '[' NUMBER ']' -> ^( INDEX NUMBER ) ;
    public final ParserParser.index_return index() throws RecognitionException {
        ParserParser.index_return retval = new ParserParser.index_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal31=null;
        Token NUMBER32=null;
        Token char_literal33=null;

        Object char_literal31_tree=null;
        Object NUMBER32_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:130:2: ( '[' NUMBER ']' -> ^( INDEX NUMBER ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:131:2: '[' NUMBER ']'
            {
            char_literal31=(Token)match(input,26,FOLLOW_26_in_index475);  
            stream_26.add(char_literal31);


            NUMBER32=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_index477);  
            stream_NUMBER.add(NUMBER32);


            char_literal33=(Token)match(input,27,FOLLOW_27_in_index479);  
            stream_27.add(char_literal33);


            // AST REWRITE
            // elements: NUMBER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:17: -> ^( INDEX NUMBER )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:131:20: ^( INDEX NUMBER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INDEX, "INDEX")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUMBER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "index"


    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:134:1: functionCall : ID '(' ( parameters )? ')' -> ^( CALL ID ( parameters )? ) ;
    public final ParserParser.functionCall_return functionCall() throws RecognitionException {
        ParserParser.functionCall_return retval = new ParserParser.functionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        ParserParser.parameters_return parameters36 =null;


        Object ID34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:135:2: ( ID '(' ( parameters )? ')' -> ^( CALL ID ( parameters )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:136:2: ID '(' ( parameters )? ')'
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_functionCall497);  
            stream_ID.add(ID34);


            char_literal35=(Token)match(input,18,FOLLOW_18_in_functionCall499);  
            stream_18.add(char_literal35);


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:136:9: ( parameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||LA9_0==NUMBER||LA9_0==18||LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:136:9: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_functionCall501);
                    parameters36=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters36.getTree());

                    }
                    break;

            }


            char_literal37=(Token)match(input,19,FOLLOW_19_in_functionCall504);  
            stream_19.add(char_literal37);


            // AST REWRITE
            // elements: parameters, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:25: -> ^( CALL ID ( parameters )? )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:136:28: ^( CALL ID ( parameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:136:38: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:139:1: parameters : expression ( ',' expression )* -> ^( PARAMETERS ( expression )* ) ;
    public final ParserParser.parameters_return parameters() throws RecognitionException {
        ParserParser.parameters_return retval = new ParserParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal39=null;
        ParserParser.expression_return expression38 =null;

        ParserParser.expression_return expression40 =null;


        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:140:2: ( expression ( ',' expression )* -> ^( PARAMETERS ( expression )* ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:141:2: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_parameters525);
            expression38=expression();

            state._fsp--;

            stream_expression.add(expression38.getTree());

            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:141:13: ( ',' expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:141:14: ',' expression
            	    {
            	    char_literal39=(Token)match(input,22,FOLLOW_22_in_parameters528);  
            	    stream_22.add(char_literal39);


            	    pushFollow(FOLLOW_expression_in_parameters530);
            	    expression40=expression();

            	    state._fsp--;

            	    stream_expression.add(expression40.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:31: -> ^( PARAMETERS ( expression )* )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:141:34: ^( PARAMETERS ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                , root_1);

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:141:47: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class functionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDef"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:144:1: functionDef : ID '(' ( parameterDef )? ')' -> ^( FUNCTION ID ( parameterDef )? ) ;
    public final ParserParser.functionDef_return functionDef() throws RecognitionException {
        ParserParser.functionDef_return retval = new ParserParser.functionDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        ParserParser.parameterDef_return parameterDef43 =null;


        Object ID41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_parameterDef=new RewriteRuleSubtreeStream(adaptor,"rule parameterDef");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:145:2: ( ID '(' ( parameterDef )? ')' -> ^( FUNCTION ID ( parameterDef )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:146:2: ID '(' ( parameterDef )? ')'
            {
            ID41=(Token)match(input,ID,FOLLOW_ID_in_functionDef551);  
            stream_ID.add(ID41);


            char_literal42=(Token)match(input,18,FOLLOW_18_in_functionDef553);  
            stream_18.add(char_literal42);


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:146:9: ( parameterDef )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:146:9: parameterDef
                    {
                    pushFollow(FOLLOW_parameterDef_in_functionDef555);
                    parameterDef43=parameterDef();

                    state._fsp--;

                    stream_parameterDef.add(parameterDef43.getTree());

                    }
                    break;

            }


            char_literal44=(Token)match(input,19,FOLLOW_19_in_functionDef558);  
            stream_19.add(char_literal44);


            // AST REWRITE
            // elements: parameterDef, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:27: -> ^( FUNCTION ID ( parameterDef )? )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:146:30: ^( FUNCTION ID ( parameterDef )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:146:44: ( parameterDef )?
                if ( stream_parameterDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterDef.nextTree());

                }
                stream_parameterDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDef"


    public static class parameterDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterDef"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:149:1: parameterDef : ( ID ( ',' ID )* ) -> ^( PARAMETERS ( ID )* ) ;
    public final ParserParser.parameterDef_return parameterDef() throws RecognitionException {
        ParserParser.parameterDef_return retval = new ParserParser.parameterDef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID45=null;
        Token char_literal46=null;
        Token ID47=null;

        Object ID45_tree=null;
        Object char_literal46_tree=null;
        Object ID47_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:150:2: ( ( ID ( ',' ID )* ) -> ^( PARAMETERS ( ID )* ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:2: ( ID ( ',' ID )* )
            {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:2: ( ID ( ',' ID )* )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:3: ID ( ',' ID )*
            {
            ID45=(Token)match(input,ID,FOLLOW_ID_in_parameterDef580);  
            stream_ID.add(ID45);


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:6: ( ',' ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:7: ',' ID
            	    {
            	    char_literal46=(Token)match(input,22,FOLLOW_22_in_parameterDef583);  
            	    stream_22.add(char_literal46);


            	    ID47=(Token)match(input,ID,FOLLOW_ID_in_parameterDef585);  
            	    stream_ID.add(ID47);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:17: -> ^( PARAMETERS ( ID )* )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:20: ^( PARAMETERS ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                , root_1);

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:151:33: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterDef"


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "command"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:154:1: command : '/' ID ( commandParams )? -> ^( COMMAND ID ( commandParams )? ) ;
    public final ParserParser.command_return command() throws RecognitionException {
        ParserParser.command_return retval = new ParserParser.command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal48=null;
        Token ID49=null;
        ParserParser.commandParams_return commandParams50 =null;


        Object char_literal48_tree=null;
        Object ID49_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_commandParams=new RewriteRuleSubtreeStream(adaptor,"rule commandParams");
        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:155:2: ( '/' ID ( commandParams )? -> ^( COMMAND ID ( commandParams )? ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:156:2: '/' ID ( commandParams )?
            {
            char_literal48=(Token)match(input,24,FOLLOW_24_in_command607);  
            stream_24.add(char_literal48);


            ID49=(Token)match(input,ID,FOLLOW_ID_in_command609);  
            stream_ID.add(ID49);


            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:156:9: ( commandParams )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:156:9: commandParams
                    {
                    pushFollow(FOLLOW_commandParams_in_command611);
                    commandParams50=commandParams();

                    state._fsp--;

                    stream_commandParams.add(commandParams50.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, commandParams
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:24: -> ^( COMMAND ID ( commandParams )? )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:156:27: ^( COMMAND ID ( commandParams )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COMMAND, "COMMAND")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:156:40: ( commandParams )?
                if ( stream_commandParams.hasNext() ) {
                    adaptor.addChild(root_1, stream_commandParams.nextTree());

                }
                stream_commandParams.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "command"


    public static class commandParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commandParams"
    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:159:1: commandParams : ( ID )+ -> ^( PARAMETERS ( ID )+ ) ;
    public final ParserParser.commandParams_return commandParams() throws RecognitionException {
        ParserParser.commandParams_return retval = new ParserParser.commandParams_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID51=null;

        Object ID51_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:160:2: ( ( ID )+ -> ^( PARAMETERS ( ID )+ ) )
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:161:2: ( ID )+
            {
            // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:161:2: ( ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:161:2: ID
            	    {
            	    ID51=(Token)match(input,ID,FOLLOW_ID_in_commandParams633);  
            	    stream_ID.add(ID51);


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:6: -> ^( PARAMETERS ( ID )+ )
            {
                // C:\\Eclipse\\Workspaces\\MCP\\com.burnerpat.mcp\\antlr\\Parser.g:161:9: ^( PARAMETERS ( ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETERS, "PARAMETERS")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

            catch (RecognitionException e) {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commandParams"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\2\uffff\1\1\5\uffff\1\1\2\uffff\1\1\1\uffff";
    static final String DFA1_minS =
        "\1\11\1\uffff\1\21\1\uffff\1\11\1\15\1\uffff\2\21\1\33\1\11\2\21";
    static final String DFA1_maxS =
        "\1\30\1\uffff\1\34\1\uffff\1\27\1\15\1\uffff\2\34\1\33\1\27\2\34";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\6\uffff";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\1\4\uffff\1\1\4\uffff\1\1\1\3",
            "",
            "\1\1\1\4\1\uffff\2\1\1\uffff\2\1\1\6\1\5\1\uffff\1\1",
            "",
            "\1\7\3\uffff\1\1\4\uffff\1\1\1\10\3\uffff\1\1",
            "\1\11",
            "",
            "\2\1\1\10\2\1\1\12\2\1\1\uffff\1\1\1\uffff\1\1",
            "\1\1\2\uffff\2\1\1\uffff\2\1\1\6\2\uffff\1\1",
            "\1\13",
            "\1\14\3\uffff\1\1\4\uffff\1\1\4\uffff\1\1",
            "\1\1\2\uffff\2\1\1\uffff\2\1\1\6\2\uffff\1\1",
            "\2\1\1\10\2\1\1\12\2\1\1\uffff\1\1\1\uffff\1\1"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "87:1: statement : ( expression | assignment | command );";
        }
    }
 

    public static final BitSet FOLLOW_expression_in_statement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_command_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpression_in_expression288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulExpression_in_addExpression298 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_21_in_addExpression302 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_23_in_addExpression307 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_mulExpression_in_addExpression311 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_atomExpression_in_mulExpression323 = new BitSet(new long[]{0x0000000011120002L});
    public static final BitSet FOLLOW_20_in_mulExpression327 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_24_in_mulExpression332 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_17_in_mulExpression337 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_28_in_mulExpression342 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_atomExpression_in_mulExpression346 = new BitSet(new long[]{0x0000000011120002L});
    public static final BitSet FOLLOW_23_in_atomExpression358 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_atomExpression_in_atomExpression360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atomExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_atomExpression380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atomExpression385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_atomExpression390 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_addExpression_in_atomExpression392 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_atomExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment408 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assignment410 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_expression_in_assignment412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDef_in_assignment427 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assignment429 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_expression_in_assignment431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable451 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_index_in_variable453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_index475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_NUMBER_in_index477 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_index479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionCall497 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_functionCall499 = new BitSet(new long[]{0x00000000008C2200L});
    public static final BitSet FOLLOW_parameters_in_functionCall501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_functionCall504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameters525 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_parameters528 = new BitSet(new long[]{0x0000000000842200L});
    public static final BitSet FOLLOW_expression_in_parameters530 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ID_in_functionDef551 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_functionDef553 = new BitSet(new long[]{0x0000000000080200L});
    public static final BitSet FOLLOW_parameterDef_in_functionDef555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_functionDef558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parameterDef580 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_parameterDef583 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_parameterDef585 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_24_in_command607 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_command609 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_commandParams_in_command611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_commandParams633 = new BitSet(new long[]{0x0000000000000202L});

}