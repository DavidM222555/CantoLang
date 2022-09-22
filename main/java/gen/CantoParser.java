package gen;// Generated from C:/CantoLanguage/src/main/java\Canto.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, K_FLOAT=41, K_INT=42, K_VOID=43, K_BOOL=44, ID=45, 
		LETTER=46, INT=47, CharLiteral=48, UnteriminatedCharLiteral=49, StringLiteral=50, 
		UnterminatedStringLiteral=51, WS=52, SL_COMMENT=53;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_if = 2, RULE_elseIf = 3, RULE_else = 4, 
		RULE_assign = 5, RULE_varDecl = 6, RULE_mutVarDecl = 7, RULE_immutVarDecl = 8, 
		RULE_funcDecl = 9, RULE_argList = 10, RULE_arg = 11, RULE_block = 12, 
		RULE_print = 13, RULE_while = 14, RULE_until = 15, RULE_expr = 16, RULE_exprList = 17, 
		RULE_return = 18, RULE_type = 19, RULE_bool = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "statement", "if", "elseIf", "else", "assign", "varDecl", "mutVarDecl", 
			"immutVarDecl", "funcDecl", "argList", "arg", "block", "print", "while", 
			"until", "expr", "exprList", "return", "type", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'else if'", "'else'", "'='", "'let'", "':'", "'set'", 
			"'func'", "'('", "')'", "'->'", "','", "'{'", "'}'", "'print'", "'while'", 
			"'until'", "'['", "']'", "'-'", "'not'", "'*'", "'+'", "'/'", "'//'", 
			"'%'", "'=='", "'and'", "'or'", "'xor'", "'<'", "'<='", "'>'", "'>='", 
			"'return'", "'char'", "'string'", "'true'", "'false'", "'float'", "'int'", 
			"'void'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "K_FLOAT", "K_INT", "K_VOID", "K_BOOL", 
			"ID", "LETTER", "INT", "CharLiteral", "UnteriminatedCharLiteral", "StringLiteral", 
			"UnterminatedStringLiteral", "WS", "SL_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Canto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				varDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				funcDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				if_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				expr(0);
				setState(53);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				until();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				return_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
			expr(0);
			setState(63);
			statement();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					elseIf();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				else_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			expr(0);
			setState(75);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__3);
			setState(78);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(T__4);
			setState(82);
			expr(0);
			setState(83);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public MutVarDeclContext mutVarDecl() {
			return getRuleContext(MutVarDeclContext.class,0);
		}
		public ImmutVarDeclContext immutVarDecl() {
			return getRuleContext(ImmutVarDeclContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				mutVarDecl();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				immutVarDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutVarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MutVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterMutVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitMutVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitMutVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutVarDeclContext mutVarDecl() throws RecognitionException {
		MutVarDeclContext _localctx = new MutVarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mutVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__5);
			setState(90);
			match(ID);
			setState(91);
			match(T__6);
			setState(92);
			type();
			setState(93);
			match(T__4);
			setState(94);
			expr(0);
			setState(95);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmutVarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImmutVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterImmutVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitImmutVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitImmutVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmutVarDeclContext immutVarDecl() throws RecognitionException {
		ImmutVarDeclContext _localctx = new ImmutVarDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_immutVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__7);
			setState(98);
			match(ID);
			setState(99);
			match(T__6);
			setState(100);
			type();
			setState(101);
			match(T__4);
			setState(102);
			expr(0);
			setState(103);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__8);
			setState(106);
			match(ID);
			setState(107);
			match(T__9);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				argList();
				}
			}

			setState(111);
			match(T__10);
			setState(112);
			match(T__11);
			setState(113);
			type();
			setState(114);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argList);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				arg();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(117);
					match(T__12);
					setState(118);
					arg();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(T__6);
			setState(129);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__13);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__15);
			setState(141);
			match(T__9);
			setState(142);
			expr(0);
			setState(143);
			match(T__10);
			setState(144);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
			match(T__9);
			setState(148);
			expr(0);
			setState(149);
			match(T__10);
			setState(150);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UntilContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__17);
			setState(153);
			match(T__9);
			setState(154);
			expr(0);
			setState(155);
			match(T__10);
			setState(156);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanOrEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode StringLiteral() { return getToken(CantoParser.StringLiteral, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanOrEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CantoParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExprContext {
		public TerminalNode CharLiteral() { return getToken(CantoParser.CharLiteral, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IntDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterIntDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitIntDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitIntDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public XorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				match(ID);
				setState(160);
				match(T__9);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__20) | (1L << T__21) | (1L << T__38) | (1L << T__39) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(161);
					exprList();
					}
				}

				setState(164);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__20);
				setState(166);
				expr(22);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__21);
				setState(168);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				bool();
				}
				break;
			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(StringLiteral);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(CharLiteral);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__9);
				setState(175);
				expr(0);
				setState(176);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(181);
						match(T__22);
						setState(182);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(184);
						match(T__23);
						setState(185);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(187);
						match(T__20);
						setState(188);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(190);
						match(T__24);
						setState(191);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new IntDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(193);
						match(T__25);
						setState(194);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(196);
						match(T__26);
						setState(197);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(199);
						match(T__27);
						setState(200);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(202);
						match(T__28);
						setState(203);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(205);
						match(T__29);
						setState(206);
						expr(13);
						}
						break;
					case 10:
						{
						_localctx = new XorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(208);
						match(T__30);
						setState(209);
						expr(12);
						}
						break;
					case 11:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(211);
						match(T__31);
						setState(212);
						expr(11);
						}
						break;
					case 12:
						{
						_localctx = new LessThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(214);
						match(T__32);
						setState(215);
						expr(10);
						}
						break;
					case 13:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(217);
						match(T__33);
						setState(218);
						expr(9);
						}
						break;
					case 14:
						{
						_localctx = new GreaterThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						match(T__34);
						setState(221);
						expr(8);
						}
						break;
					case 15:
						{
						_localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(223);
						match(T__18);
						setState(224);
						expr(0);
						setState(225);
						match(T__19);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expr(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(233);
				match(T__12);
				setState(234);
				expr(0);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__35);
			setState(241);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_FLOAT() { return getToken(CantoParser.K_FLOAT, 0); }
		public TerminalNode K_INT() { return getToken(CantoParser.K_INT, 0); }
		public TerminalNode K_BOOL() { return getToken(CantoParser.K_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << K_FLOAT) | (1L << K_INT) | (1L << K_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u00f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t"+
		"\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tn\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001\n\u0003\n~\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u0086\b\f\n\f\f\f\u0089"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a3\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00b3\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e4\b\u0010\n\u0010\f\u0010"+
		"\u00e7\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ec\b"+
		"\u0011\n\u0011\f\u0011\u00ef\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001"+
		" \u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(\u0000\u0002\u0003\u0000%&)*,,\u0001\u0000\'("+
		"\u010c\u0000+\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004"+
		"=\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bM\u0001\u0000"+
		"\u0000\u0000\nP\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e"+
		"Y\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012i\u0001"+
		"\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000"+
		"\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u008c\u0001\u0000"+
		"\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0098\u0001\u0000"+
		"\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00e8\u0001\u0000\u0000"+
		"\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00f3\u0001\u0000\u0000\u0000("+
		"\u00f5\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/<\u0003\u0018\f\u0000"+
		"0<\u0003\n\u0005\u00001<\u0003\f\u0006\u00002<\u0003\u0012\t\u00003<\u0003"+
		"\u0004\u0002\u000045\u0003 \u0010\u000056\u0005\u0001\u0000\u00006<\u0001"+
		"\u0000\u0000\u00007<\u0003\u001c\u000e\u00008<\u0003\u001e\u000f\u0000"+
		"9<\u0003$\u0012\u0000:<\u0003\u001a\r\u0000;/\u0001\u0000\u0000\u0000"+
		";0\u0001\u0000\u0000\u0000;1\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000"+
		"\u0000;3\u0001\u0000\u0000\u0000;4\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005\u0002\u0000"+
		"\u0000>?\u0003 \u0010\u0000?C\u0003\u0002\u0001\u0000@B\u0003\u0006\u0003"+
		"\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FH\u0003\b\u0004\u0000GF\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000"+
		"\u0000JK\u0003 \u0010\u0000KL\u0003\u0002\u0001\u0000L\u0007\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0003\u0002\u0001\u0000O\t\u0001"+
		"\u0000\u0000\u0000PQ\u0005-\u0000\u0000QR\u0005\u0005\u0000\u0000RS\u0003"+
		" \u0010\u0000ST\u0005\u0001\u0000\u0000T\u000b\u0001\u0000\u0000\u0000"+
		"UX\u0003\u000e\u0007\u0000VX\u0003\u0010\b\u0000WU\u0001\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000"+
		"\u0000Z[\u0005-\u0000\u0000[\\\u0005\u0007\u0000\u0000\\]\u0003&\u0013"+
		"\u0000]^\u0005\u0005\u0000\u0000^_\u0003 \u0010\u0000_`\u0005\u0001\u0000"+
		"\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005-\u0000"+
		"\u0000cd\u0005\u0007\u0000\u0000de\u0003&\u0013\u0000ef\u0005\u0005\u0000"+
		"\u0000fg\u0003 \u0010\u0000gh\u0005\u0001\u0000\u0000h\u0011\u0001\u0000"+
		"\u0000\u0000ij\u0005\t\u0000\u0000jk\u0005-\u0000\u0000km\u0005\n\u0000"+
		"\u0000ln\u0003\u0014\n\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0005\u000b\u0000\u0000pq\u0005\f\u0000"+
		"\u0000qr\u0003&\u0013\u0000rs\u0003\u0018\f\u0000s\u0013\u0001\u0000\u0000"+
		"\u0000ty\u0003\u0016\u000b\u0000uv\u0005\r\u0000\u0000vx\u0003\u0016\u000b"+
		"\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z~\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|~\u0003\u0016\u000b\u0000}t\u0001\u0000\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005-\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0003"+
		"&\u0013\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0087\u0005\u000e"+
		"\u0000\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u000f"+
		"\u0000\u0000\u008b\u0019\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0010"+
		"\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0003 \u0010"+
		"\u0000\u008f\u0090\u0005\u000b\u0000\u0000\u0090\u0091\u0005\u0001\u0000"+
		"\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0011\u0000"+
		"\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095\u0003 \u0010\u0000"+
		"\u0095\u0096\u0005\u000b\u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097"+
		"\u001d\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0012\u0000\u0000\u0099"+
		"\u009a\u0005\n\u0000\u0000\u009a\u009b\u0003 \u0010\u0000\u009b\u009c"+
		"\u0005\u000b\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u001f\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0006\u0010\uffff\uffff\u0000\u009f\u00a0"+
		"\u0005-\u0000\u0000\u00a0\u00a2\u0005\n\u0000\u0000\u00a1\u00a3\u0003"+
		"\"\u0011\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00b3\u0005\u000b"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00b3\u0003 \u0010"+
		"\u0016\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00b3\u0003 \u0010\u0015"+
		"\u00a9\u00b3\u0003(\u0014\u0000\u00aa\u00b3\u0005-\u0000\u0000\u00ab\u00b3"+
		"\u0005/\u0000\u0000\u00ac\u00b3\u00052\u0000\u0000\u00ad\u00b3\u00050"+
		"\u0000\u0000\u00ae\u00af\u0005\n\u0000\u0000\u00af\u00b0\u0003 \u0010"+
		"\u0000\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u009e\u0001\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\n\u0014\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000"+
		"\u00b6\u00e4\u0003 \u0010\u0015\u00b7\u00b8\n\u0013\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0018\u0000\u0000\u00b9\u00e4\u0003 \u0010\u0014\u00ba\u00bb"+
		"\n\u0012\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00e4\u0003"+
		" \u0010\u0013\u00bd\u00be\n\u0011\u0000\u0000\u00be\u00bf\u0005\u0019"+
		"\u0000\u0000\u00bf\u00e4\u0003 \u0010\u0012\u00c0\u00c1\n\u0010\u0000"+
		"\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u00e4\u0003 \u0010\u0011"+
		"\u00c3\u00c4\n\u000f\u0000\u0000\u00c4\u00c5\u0005\u001b\u0000\u0000\u00c5"+
		"\u00e4\u0003 \u0010\u0010\u00c6\u00c7\n\u000e\u0000\u0000\u00c7\u00c8"+
		"\u0005\u001c\u0000\u0000\u00c8\u00e4\u0003 \u0010\u000f\u00c9\u00ca\n"+
		"\r\u0000\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u00e4\u0003 "+
		"\u0010\u000e\u00cc\u00cd\n\f\u0000\u0000\u00cd\u00ce\u0005\u001e\u0000"+
		"\u0000\u00ce\u00e4\u0003 \u0010\r\u00cf\u00d0\n\u000b\u0000\u0000\u00d0"+
		"\u00d1\u0005\u001f\u0000\u0000\u00d1\u00e4\u0003 \u0010\f\u00d2\u00d3"+
		"\n\n\u0000\u0000\u00d3\u00d4\u0005 \u0000\u0000\u00d4\u00e4\u0003 \u0010"+
		"\u000b\u00d5\u00d6\n\t\u0000\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7"+
		"\u00e4\u0003 \u0010\n\u00d8\u00d9\n\b\u0000\u0000\u00d9\u00da\u0005\""+
		"\u0000\u0000\u00da\u00e4\u0003 \u0010\t\u00db\u00dc\n\u0007\u0000\u0000"+
		"\u00dc\u00dd\u0005#\u0000\u0000\u00dd\u00e4\u0003 \u0010\b\u00de\u00df"+
		"\n\u0017\u0000\u0000\u00df\u00e0\u0005\u0013\u0000\u0000\u00e0\u00e1\u0003"+
		" \u0010\u0000\u00e1\u00e2\u0005\u0014\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00b4\u0001\u0000\u0000\u0000\u00e3\u00b7\u0001\u0000"+
		"\u0000\u0000\u00e3\u00ba\u0001\u0000\u0000\u0000\u00e3\u00bd\u0001\u0000"+
		"\u0000\u0000\u00e3\u00c0\u0001\u0000\u0000\u0000\u00e3\u00c3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00c6\u0001\u0000\u0000\u0000\u00e3\u00c9\u0001\u0000"+
		"\u0000\u0000\u00e3\u00cc\u0001\u0000\u0000\u0000\u00e3\u00cf\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d2\u0001\u0000\u0000\u0000\u00e3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00db\u0001\u0000"+
		"\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ed\u0003 \u0010\u0000\u00e9\u00ea\u0005\r\u0000\u0000"+
		"\u00ea\u00ec\u0003 \u0010\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee#\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u00f2\u0003"+
		" \u0010\u0000\u00f2%\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007\u0000\u0000"+
		"\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007\u0001\u0000\u0000"+
		"\u00f6)\u0001\u0000\u0000\u0000\u000e-;CGWmy}\u0087\u00a2\u00b2\u00e3"+
		"\u00e5\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}