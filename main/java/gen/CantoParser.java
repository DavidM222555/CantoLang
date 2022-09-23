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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, K_FLOAT=52, 
		K_INT=53, K_VOID=54, K_BOOL=55, ID=56, LETTER=57, INT=58, CharLiteral=59, 
		UnteriminatedCharLiteral=60, StringLiteral=61, UnterminatedStringLiteral=62, 
		WS=63, SL_COMMENT=64;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_listConcat = 2, RULE_listIndex = 3, 
		RULE_increment = 4, RULE_decrement = 5, RULE_classDecl = 6, RULE_classVar = 7, 
		RULE_classMethod = 8, RULE_accessModifier = 9, RULE_if = 10, RULE_elseIf = 11, 
		RULE_else = 12, RULE_assign = 13, RULE_varDecl = 14, RULE_mutVarDecl = 15, 
		RULE_immutVarDecl = 16, RULE_immutListDecl = 17, RULE_mutListDecl = 18, 
		RULE_funcDecl = 19, RULE_argList = 20, RULE_arg = 21, RULE_block = 22, 
		RULE_print = 23, RULE_while = 24, RULE_until = 25, RULE_forRange = 26, 
		RULE_forEach = 27, RULE_expr = 28, RULE_exprList = 29, RULE_return = 30, 
		RULE_type = 31, RULE_listType = 32, RULE_bool = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "statement", "listConcat", "listIndex", "increment", "decrement", 
			"classDecl", "classVar", "classMethod", "accessModifier", "if", "elseIf", 
			"else", "assign", "varDecl", "mutVarDecl", "immutVarDecl", "immutListDecl", 
			"mutListDecl", "funcDecl", "argList", "arg", "block", "print", "while", 
			"until", "forRange", "forEach", "expr", "exprList", "return", "type", 
			"listType", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'++'", "'['", "']'", "'='", "'+='", "'-='", "'struct'", 
			"'{'", "'}'", "':'", "'pub'", "'priv'", "'if'", "'else if'", "'else'", 
			"'let'", "'var'", "'func'", "'('", "')'", "'->'", "','", "'print'", "'while'", 
			"'until'", "'for'", "'from'", "'to'", "'by'", "'in'", "'-'", "'not'", 
			"'*'", "'+'", "'/'", "'//'", "'%'", "'=='", "'and'", "'or'", "'xor'", 
			"'<'", "'<='", "'>'", "'>='", "'return'", "'char'", "'string'", "'true'", 
			"'false'", "'float'", "'int'", "'void'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "K_FLOAT", "K_INT", "K_VOID", "K_BOOL", "ID", 
			"LETTER", "INT", "CharLiteral", "UnteriminatedCharLiteral", "StringLiteral", 
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__46) | (1L << T__49) | (1L << T__50) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0) );
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
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}
		public ForRangeContext forRange() {
			return getRuleContext(ForRangeContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ListConcatContext listConcat() {
			return getRuleContext(ListConcatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListIndexContext listIndex() {
			return getRuleContext(ListIndexContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				varDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				funcDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				classDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				forEach();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				forRange();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				if_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				increment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				decrement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
				listConcat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(84);
				expr(0);
				setState(85);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(87);
				listIndex();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(88);
				while_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(89);
				until();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(90);
				return_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(91);
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

	public static class ListConcatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterListConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitListConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitListConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListConcatContext listConcat() throws RecognitionException {
		ListConcatContext _localctx = new ListConcatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(95);
			match(T__1);
			setState(96);
			expr(0);
			setState(97);
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

	public static class ListIndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterListIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitListIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitListIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListIndexContext listIndex() throws RecognitionException {
		ListIndexContext _localctx = new ListIndexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__2);
			setState(101);
			expr(0);
			setState(102);
			match(T__3);
			setState(103);
			match(T__4);
			setState(104);
			expr(0);
			setState(105);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(T__5);
			setState(109);
			expr(0);
			setState(110);
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

	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(T__6);
			setState(114);
			expr(0);
			setState(115);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public List<ClassVarContext> classVar() {
			return getRuleContexts(ClassVarContext.class);
		}
		public ClassVarContext classVar(int i) {
			return getRuleContext(ClassVarContext.class,i);
		}
		public List<ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__7);
			setState(118);
			match(ID);
			setState(119);
			match(T__8);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(120);
					classVar();
					}
					break;
				case 2:
					{
					setState(121);
					classMethod();
					}
					break;
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__9);
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

	public static class ClassVarContext extends ParserRuleContext {
		public ClassVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVar; }
	 
		public ClassVarContext() { }
		public void copyFrom(ClassVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassVarInitContext extends ClassVarContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassVarInitContext(ClassVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterClassVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitClassVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitClassVarInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassVarDeclContext extends ClassVarContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassVarDeclContext(ClassVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterClassVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitClassVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitClassVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarContext classVar() throws RecognitionException {
		ClassVarContext _localctx = new ClassVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classVar);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ClassVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(129);
					accessModifier();
					}
				}

				setState(132);
				match(ID);
				setState(133);
				match(T__10);
				setState(134);
				type();
				setState(135);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ClassVarInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(137);
					accessModifier();
					}
				}

				setState(140);
				match(ID);
				setState(141);
				match(T__10);
				setState(142);
				type();
				setState(143);
				match(T__4);
				setState(144);
				expr(0);
				setState(145);
				match(T__0);
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

	public static class ClassMethodContext extends ParserRuleContext {
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(149);
				accessModifier();
				}
			}

			setState(152);
			funcDecl();
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

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	 
		public AccessModifierContext() { }
		public void copyFrom(AccessModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrivateContext extends AccessModifierContext {
		public PrivateContext(AccessModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterPrivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitPrivate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitPrivate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PublicContext extends AccessModifierContext {
		public PublicContext(AccessModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterPublic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitPublic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitPublic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_accessModifier);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new PublicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new PrivateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__12);
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
		enterRule(_localctx, 20, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__13);
			setState(159);
			expr(0);
			setState(160);
			statement();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					elseIf();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(167);
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
		enterRule(_localctx, 22, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__14);
			setState(171);
			expr(0);
			setState(172);
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
		enterRule(_localctx, 24, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(175);
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
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(T__4);
			setState(179);
			expr(0);
			setState(180);
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
		public ImmutListDeclContext immutListDecl() {
			return getRuleContext(ImmutListDeclContext.class,0);
		}
		public MutListDeclContext mutListDecl() {
			return getRuleContext(MutListDeclContext.class,0);
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
		enterRule(_localctx, 28, RULE_varDecl);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				mutVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				immutVarDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				immutListDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				mutListDecl();
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
		enterRule(_localctx, 30, RULE_mutVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__16);
			setState(189);
			match(ID);
			setState(190);
			match(T__10);
			setState(191);
			type();
			setState(192);
			match(T__4);
			setState(193);
			expr(0);
			setState(194);
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
		enterRule(_localctx, 32, RULE_immutVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__17);
			setState(197);
			match(ID);
			setState(198);
			match(T__10);
			setState(199);
			type();
			setState(200);
			match(T__4);
			setState(201);
			expr(0);
			setState(202);
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

	public static class ImmutListDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ImmutListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutListDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterImmutListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitImmutListDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitImmutListDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmutListDeclContext immutListDecl() throws RecognitionException {
		ImmutListDeclContext _localctx = new ImmutListDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_immutListDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__16);
			setState(205);
			match(ID);
			setState(206);
			match(T__10);
			setState(207);
			match(T__2);
			setState(208);
			type();
			setState(209);
			match(T__3);
			setState(210);
			match(T__4);
			setState(211);
			match(T__2);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__31) | (1L << T__32) | (1L << T__49) | (1L << T__50) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(212);
				exprList();
				}
			}

			setState(215);
			match(T__3);
			setState(216);
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

	public static class MutListDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MutListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutListDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterMutListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitMutListDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitMutListDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutListDeclContext mutListDecl() throws RecognitionException {
		MutListDeclContext _localctx = new MutListDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mutListDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__17);
			setState(219);
			match(ID);
			setState(220);
			match(T__10);
			setState(221);
			match(T__2);
			setState(222);
			type();
			setState(223);
			match(T__3);
			setState(224);
			match(T__4);
			setState(225);
			match(T__2);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__31) | (1L << T__32) | (1L << T__49) | (1L << T__50) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(226);
				exprList();
				}
			}

			setState(229);
			match(T__3);
			setState(230);
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
		enterRule(_localctx, 38, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__18);
			setState(233);
			match(ID);
			setState(234);
			match(T__19);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(235);
				argList();
				}
			}

			setState(238);
			match(T__20);
			setState(239);
			match(T__21);
			setState(240);
			type();
			setState(241);
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
		enterRule(_localctx, 40, RULE_argList);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				arg();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(244);
					match(T__22);
					setState(245);
					arg();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
		enterRule(_localctx, 42, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(T__10);
			setState(256);
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
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__8);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__46) | (1L << T__49) | (1L << T__50) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(T__9);
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
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__23);
			setState(268);
			match(T__19);
			setState(269);
			expr(0);
			setState(270);
			match(T__20);
			setState(271);
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
		enterRule(_localctx, 48, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__24);
			setState(274);
			match(T__19);
			setState(275);
			expr(0);
			setState(276);
			match(T__20);
			setState(277);
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
		enterRule(_localctx, 50, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__25);
			setState(280);
			match(T__19);
			setState(281);
			expr(0);
			setState(282);
			match(T__20);
			setState(283);
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

	public static class ForRangeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterForRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitForRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitForRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeContext forRange() throws RecognitionException {
		ForRangeContext _localctx = new ForRangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__26);
			setState(286);
			match(ID);
			setState(287);
			match(T__27);
			setState(288);
			expr(0);
			setState(289);
			match(T__28);
			setState(290);
			expr(0);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(291);
				match(T__29);
				setState(292);
				expr(0);
				}
			}

			setState(295);
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

	public static class ForEachContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CantoParser.ID, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__26);
			setState(298);
			match(ID);
			setState(299);
			match(T__30);
			setState(300);
			match(ID);
			setState(301);
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
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
		public TerminalNode INT() { return getToken(CantoParser.INT, 0); }
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(304);
				match(ID);
				setState(305);
				match(T__19);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__31) | (1L << T__32) | (1L << T__49) | (1L << T__50) | (1L << ID) | (1L << INT) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(306);
					exprList();
					}
				}

				setState(309);
				match(T__20);
				}
				break;
			case 2:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(ID);
				setState(311);
				match(T__2);
				setState(312);
				match(INT);
				setState(313);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(T__31);
				setState(315);
				expr(22);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(T__32);
				setState(317);
				expr(21);
				}
				break;
			case 5:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				bool();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(StringLiteral);
				}
				break;
			case 9:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(CharLiteral);
				}
				break;
			case 10:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(T__19);
				setState(324);
				expr(0);
				setState(325);
				match(T__20);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(330);
						match(T__33);
						setState(331);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(333);
						match(T__34);
						setState(334);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(336);
						match(T__31);
						setState(337);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(339);
						match(T__35);
						setState(340);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new IntDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(342);
						match(T__36);
						setState(343);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(345);
						match(T__37);
						setState(346);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(348);
						match(T__38);
						setState(349);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(351);
						match(T__39);
						setState(352);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(354);
						match(T__40);
						setState(355);
						expr(13);
						}
						break;
					case 10:
						{
						_localctx = new XorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(357);
						match(T__41);
						setState(358);
						expr(12);
						}
						break;
					case 11:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						match(T__42);
						setState(361);
						expr(11);
						}
						break;
					case 12:
						{
						_localctx = new LessThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(363);
						match(T__43);
						setState(364);
						expr(10);
						}
						break;
					case 13:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(366);
						match(T__44);
						setState(367);
						expr(9);
						}
						break;
					case 14:
						{
						_localctx = new GreaterThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(368);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(369);
						match(T__45);
						setState(370);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 58, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expr(0);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(377);
				match(T__22);
				setState(378);
				expr(0);
				}
				}
				setState(383);
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
		enterRule(_localctx, 60, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__46);
			setState(385);
			expr(0);
			setState(386);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_FLOAT() { return getToken(CantoParser.K_FLOAT, 0); }
		public TerminalNode K_INT() { return getToken(CantoParser.K_INT, 0); }
		public TerminalNode K_BOOL() { return getToken(CantoParser.K_BOOL, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CantoParser.ID, 0); }
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
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(K_FLOAT);
				}
				break;
			case K_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(K_INT);
				}
				break;
			case K_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(K_BOOL);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(T__48);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				listType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				match(ID);
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

	public static class ListTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CantoListener) ((CantoListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CantoVisitor) return ((CantoVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__2);
			setState(398);
			type();
			setState(399);
			match(T__3);
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
		enterRule(_localctx, 66, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
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
		case 28:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0194\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0004"+
		"\u0000F\b\u0000\u000b\u0000\f\u0000G\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006"+
		"\n\u0006\f\u0006~\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007"+
		"\u0083\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007"+
		"\u0001\b\u0003\b\u0097\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u009d"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a3\b\n\n\n\f\n\u00a6\t"+
		"\n\u0001\n\u0003\n\u00a9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bb\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00d6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e4\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00ed\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00f7\b\u0014"+
		"\n\u0014\f\u0014\u00fa\t\u0014\u0001\u0014\u0003\u0014\u00fd\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0105\b\u0016\n\u0016\f\u0016\u0108\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0126\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0134\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0148\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0174\b\u001c\n\u001c\f\u001c\u0177"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u017c\b\u001d"+
		"\n\u001d\f\u001d\u017f\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u018c\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0000\u00018\"\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000"+
		"\u0001\u0001\u000023\u01b4\u0000E\u0001\u0000\u0000\u0000\u0002\\\u0001"+
		"\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000"+
		"\u0000\bk\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\fu\u0001"+
		"\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u0096\u0001"+
		"\u0000\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u009e\u0001"+
		"\u0000\u0000\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00ae\u0001"+
		"\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00ba\u0001"+
		"\u0000\u0000\u0000\u001e\u00bc\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000"+
		"\u0000\u0000\"\u00cc\u0001\u0000\u0000\u0000$\u00da\u0001\u0000\u0000"+
		"\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00fc\u0001\u0000\u0000\u0000*"+
		"\u00fe\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000.\u010b\u0001"+
		"\u0000\u0000\u00000\u0111\u0001\u0000\u0000\u00002\u0117\u0001\u0000\u0000"+
		"\u00004\u011d\u0001\u0000\u0000\u00006\u0129\u0001\u0000\u0000\u00008"+
		"\u0147\u0001\u0000\u0000\u0000:\u0178\u0001\u0000\u0000\u0000<\u0180\u0001"+
		"\u0000\u0000\u0000>\u018b\u0001\u0000\u0000\u0000@\u018d\u0001\u0000\u0000"+
		"\u0000B\u0191\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0001\u0001\u0000\u0000\u0000I]\u0003,\u0016"+
		"\u0000J]\u0003\u001a\r\u0000K]\u0003\u001c\u000e\u0000L]\u0003&\u0013"+
		"\u0000M]\u0003\f\u0006\u0000N]\u00036\u001b\u0000O]\u00034\u001a\u0000"+
		"P]\u0003\u0014\n\u0000Q]\u0003\b\u0004\u0000R]\u0003\n\u0005\u0000S]\u0003"+
		"\u0004\u0002\u0000TU\u00038\u001c\u0000UV\u0005\u0001\u0000\u0000V]\u0001"+
		"\u0000\u0000\u0000W]\u0003\u0006\u0003\u0000X]\u00030\u0018\u0000Y]\u0003"+
		"2\u0019\u0000Z]\u0003<\u001e\u0000[]\u0003.\u0017\u0000\\I\u0001\u0000"+
		"\u0000\u0000\\J\u0001\u0000\u0000\u0000\\K\u0001\u0000\u0000\u0000\\L"+
		"\u0001\u0000\u0000\u0000\\M\u0001\u0000\u0000\u0000\\N\u0001\u0000\u0000"+
		"\u0000\\O\u0001\u0000\u0000\u0000\\P\u0001\u0000\u0000\u0000\\Q\u0001"+
		"\u0000\u0000\u0000\\R\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000"+
		"\\T\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000"+
		"\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\["+
		"\u0001\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^_\u00058\u0000"+
		"\u0000_`\u0005\u0002\u0000\u0000`a\u00038\u001c\u0000ab\u0005\u0001\u0000"+
		"\u0000b\u0005\u0001\u0000\u0000\u0000cd\u00058\u0000\u0000de\u0005\u0003"+
		"\u0000\u0000ef\u00038\u001c\u0000fg\u0005\u0004\u0000\u0000gh\u0005\u0005"+
		"\u0000\u0000hi\u00038\u001c\u0000ij\u0005\u0001\u0000\u0000j\u0007\u0001"+
		"\u0000\u0000\u0000kl\u00058\u0000\u0000lm\u0005\u0006\u0000\u0000mn\u0003"+
		"8\u001c\u0000no\u0005\u0001\u0000\u0000o\t\u0001\u0000\u0000\u0000pq\u0005"+
		"8\u0000\u0000qr\u0005\u0007\u0000\u0000rs\u00038\u001c\u0000st\u0005\u0001"+
		"\u0000\u0000t\u000b\u0001\u0000\u0000\u0000uv\u0005\b\u0000\u0000vw\u0005"+
		"8\u0000\u0000w|\u0005\t\u0000\u0000x{\u0003\u000e\u0007\u0000y{\u0003"+
		"\u0010\b\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\n\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\u0012\t\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u00058\u0000"+
		"\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087\u0003>\u001f\u0000"+
		"\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0094\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0003\u0012\t\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u00058\u0000\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e\u008f"+
		"\u0003>\u001f\u0000\u008f\u0090\u0005\u0005\u0000\u0000\u0090\u0091\u0003"+
		"8\u001c\u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u0082\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000"+
		"\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0012"+
		"\t\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0003&\u0013\u0000"+
		"\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009d\u0005\f\u0000\u0000\u009b"+
		"\u009d\u0005\r\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u000e\u0000\u0000\u009f\u00a0\u00038\u001c\u0000\u00a0\u00a4\u0003"+
		"\u0002\u0001\u0000\u00a1\u00a3\u0003\u0016\u000b\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003"+
		"\u0018\f\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u0015\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000f"+
		"\u0000\u0000\u00ab\u00ac\u00038\u001c\u0000\u00ac\u00ad\u0003\u0002\u0001"+
		"\u0000\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0010\u0000"+
		"\u0000\u00af\u00b0\u0003\u0002\u0001\u0000\u00b0\u0019\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u00058\u0000\u0000\u00b2\u00b3\u0005\u0005\u0000\u0000"+
		"\u00b3\u00b4\u00038\u001c\u0000\u00b4\u00b5\u0005\u0001\u0000\u0000\u00b5"+
		"\u001b\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u001e\u000f\u0000\u00b7"+
		"\u00bb\u0003 \u0010\u0000\u00b8\u00bb\u0003\"\u0011\u0000\u00b9\u00bb"+
		"\u0003$\u0012\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0011\u0000\u0000\u00bd\u00be\u00058\u0000\u0000\u00be\u00bf\u0005\u000b"+
		"\u0000\u0000\u00bf\u00c0\u0003>\u001f\u0000\u00c0\u00c1\u0005\u0005\u0000"+
		"\u0000\u00c1\u00c2\u00038\u001c\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000"+
		"\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000"+
		"\u00c5\u00c6\u00058\u0000\u0000\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7"+
		"\u00c8\u0003>\u001f\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00ca"+
		"\u00038\u001c\u0000\u00ca\u00cb\u0005\u0001\u0000\u0000\u00cb!\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0011\u0000\u0000\u00cd\u00ce\u00058\u0000"+
		"\u0000\u00ce\u00cf\u0005\u000b\u0000\u0000\u00cf\u00d0\u0005\u0003\u0000"+
		"\u0000\u00d0\u00d1\u0003>\u001f\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d5\u0005\u0003\u0000\u0000"+
		"\u00d4\u00d6\u0003:\u001d\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0004\u0000\u0000\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9"+
		"#\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0012\u0000\u0000\u00db\u00dc"+
		"\u00058\u0000\u0000\u00dc\u00dd\u0005\u000b\u0000\u0000\u00dd\u00de\u0005"+
		"\u0003\u0000\u0000\u00de\u00df\u0003>\u001f\u0000\u00df\u00e0\u0005\u0004"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e3\u0005\u0003"+
		"\u0000\u0000\u00e2\u00e4\u0003:\u001d\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0005\u0001\u0000"+
		"\u0000\u00e7%\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0013\u0000\u0000"+
		"\u00e9\u00ea\u00058\u0000\u0000\u00ea\u00ec\u0005\u0014\u0000\u0000\u00eb"+
		"\u00ed\u0003(\u0014\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005\u0015\u0000\u0000\u00ef\u00f0\u0005\u0016\u0000\u0000\u00f0\u00f1"+
		"\u0003>\u001f\u0000\u00f1\u00f2\u0003,\u0016\u0000\u00f2\'\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f8\u0003*\u0015\u0000\u00f4\u00f5\u0005\u0017\u0000"+
		"\u0000\u00f5\u00f7\u0003*\u0015\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0003*\u0015\u0000\u00fc"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		")\u0001\u0000\u0000\u0000\u00fe\u00ff\u00058\u0000\u0000\u00ff\u0100\u0005"+
		"\u000b\u0000\u0000\u0100\u0101\u0003>\u001f\u0000\u0101+\u0001\u0000\u0000"+
		"\u0000\u0102\u0106\u0005\t\u0000\u0000\u0103\u0105\u0003\u0002\u0001\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\n\u0000\u0000\u010a-\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0005\u0018\u0000\u0000\u010c\u010d\u0005\u0014\u0000\u0000\u010d"+
		"\u010e\u00038\u001c\u0000\u010e\u010f\u0005\u0015\u0000\u0000\u010f\u0110"+
		"\u0005\u0001\u0000\u0000\u0110/\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\u0019\u0000\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113\u0114\u0003"+
		"8\u001c\u0000\u0114\u0115\u0005\u0015\u0000\u0000\u0115\u0116\u0003,\u0016"+
		"\u0000\u01161\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u001a\u0000\u0000"+
		"\u0118\u0119\u0005\u0014\u0000\u0000\u0119\u011a\u00038\u001c\u0000\u011a"+
		"\u011b\u0005\u0015\u0000\u0000\u011b\u011c\u0003,\u0016\u0000\u011c3\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u001b\u0000\u0000\u011e\u011f\u0005"+
		"8\u0000\u0000\u011f\u0120\u0005\u001c\u0000\u0000\u0120\u0121\u00038\u001c"+
		"\u0000\u0121\u0122\u0005\u001d\u0000\u0000\u0122\u0125\u00038\u001c\u0000"+
		"\u0123\u0124\u0005\u001e\u0000\u0000\u0124\u0126\u00038\u001c\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0003\u0002\u0001\u0000\u0128"+
		"5\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001b\u0000\u0000\u012a\u012b"+
		"\u00058\u0000\u0000\u012b\u012c\u0005\u001f\u0000\u0000\u012c\u012d\u0005"+
		"8\u0000\u0000\u012d\u012e\u0003\u0002\u0001\u0000\u012e7\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0006\u001c\uffff\uffff\u0000\u0130\u0131\u00058\u0000"+
		"\u0000\u0131\u0133\u0005\u0014\u0000\u0000\u0132\u0134\u0003:\u001d\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0148\u0005\u0015\u0000\u0000"+
		"\u0136\u0137\u00058\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138"+
		"\u0139\u0005:\u0000\u0000\u0139\u0148\u0005\u0004\u0000\u0000\u013a\u013b"+
		"\u0005 \u0000\u0000\u013b\u0148\u00038\u001c\u0016\u013c\u013d\u0005!"+
		"\u0000\u0000\u013d\u0148\u00038\u001c\u0015\u013e\u0148\u0003B!\u0000"+
		"\u013f\u0148\u00058\u0000\u0000\u0140\u0148\u0005:\u0000\u0000\u0141\u0148"+
		"\u0005=\u0000\u0000\u0142\u0148\u0005;\u0000\u0000\u0143\u0144\u0005\u0014"+
		"\u0000\u0000\u0144\u0145\u00038\u001c\u0000\u0145\u0146\u0005\u0015\u0000"+
		"\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u012f\u0001\u0000\u0000"+
		"\u0000\u0147\u0136\u0001\u0000\u0000\u0000\u0147\u013a\u0001\u0000\u0000"+
		"\u0000\u0147\u013c\u0001\u0000\u0000\u0000\u0147\u013e\u0001\u0000\u0000"+
		"\u0000\u0147\u013f\u0001\u0000\u0000\u0000\u0147\u0140\u0001\u0000\u0000"+
		"\u0000\u0147\u0141\u0001\u0000\u0000\u0000\u0147\u0142\u0001\u0000\u0000"+
		"\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0148\u0175\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\n\u0014\u0000\u0000\u014a\u014b\u0005\"\u0000\u0000"+
		"\u014b\u0174\u00038\u001c\u0015\u014c\u014d\n\u0013\u0000\u0000\u014d"+
		"\u014e\u0005#\u0000\u0000\u014e\u0174\u00038\u001c\u0014\u014f\u0150\n"+
		"\u0012\u0000\u0000\u0150\u0151\u0005 \u0000\u0000\u0151\u0174\u00038\u001c"+
		"\u0013\u0152\u0153\n\u0011\u0000\u0000\u0153\u0154\u0005$\u0000\u0000"+
		"\u0154\u0174\u00038\u001c\u0012\u0155\u0156\n\u0010\u0000\u0000\u0156"+
		"\u0157\u0005%\u0000\u0000\u0157\u0174\u00038\u001c\u0011\u0158\u0159\n"+
		"\u000f\u0000\u0000\u0159\u015a\u0005&\u0000\u0000\u015a\u0174\u00038\u001c"+
		"\u0010\u015b\u015c\n\u000e\u0000\u0000\u015c\u015d\u0005\'\u0000\u0000"+
		"\u015d\u0174\u00038\u001c\u000f\u015e\u015f\n\r\u0000\u0000\u015f\u0160"+
		"\u0005(\u0000\u0000\u0160\u0174\u00038\u001c\u000e\u0161\u0162\n\f\u0000"+
		"\u0000\u0162\u0163\u0005)\u0000\u0000\u0163\u0174\u00038\u001c\r\u0164"+
		"\u0165\n\u000b\u0000\u0000\u0165\u0166\u0005*\u0000\u0000\u0166\u0174"+
		"\u00038\u001c\f\u0167\u0168\n\n\u0000\u0000\u0168\u0169\u0005+\u0000\u0000"+
		"\u0169\u0174\u00038\u001c\u000b\u016a\u016b\n\t\u0000\u0000\u016b\u016c"+
		"\u0005,\u0000\u0000\u016c\u0174\u00038\u001c\n\u016d\u016e\n\b\u0000\u0000"+
		"\u016e\u016f\u0005-\u0000\u0000\u016f\u0174\u00038\u001c\t\u0170\u0171"+
		"\n\u0007\u0000\u0000\u0171\u0172\u0005.\u0000\u0000\u0172\u0174\u0003"+
		"8\u001c\b\u0173\u0149\u0001\u0000\u0000\u0000\u0173\u014c\u0001\u0000"+
		"\u0000\u0000\u0173\u014f\u0001\u0000\u0000\u0000\u0173\u0152\u0001\u0000"+
		"\u0000\u0000\u0173\u0155\u0001\u0000\u0000\u0000\u0173\u0158\u0001\u0000"+
		"\u0000\u0000\u0173\u015b\u0001\u0000\u0000\u0000\u0173\u015e\u0001\u0000"+
		"\u0000\u0000\u0173\u0161\u0001\u0000\u0000\u0000\u0173\u0164\u0001\u0000"+
		"\u0000\u0000\u0173\u0167\u0001\u0000\u0000\u0000\u0173\u016a\u0001\u0000"+
		"\u0000\u0000\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000"+
		"\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u01769\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017d\u00038\u001c\u0000"+
		"\u0179\u017a\u0005\u0017\u0000\u0000\u017a\u017c\u00038\u001c\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		";\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005/\u0000\u0000\u0181\u0182\u00038\u001c\u0000\u0182\u0183\u0005\u0001"+
		"\u0000\u0000\u0183=\u0001\u0000\u0000\u0000\u0184\u018c\u00054\u0000\u0000"+
		"\u0185\u018c\u00055\u0000\u0000\u0186\u018c\u00057\u0000\u0000\u0187\u018c"+
		"\u00050\u0000\u0000\u0188\u018c\u00051\u0000\u0000\u0189\u018c\u0003@"+
		" \u0000\u018a\u018c\u00058\u0000\u0000\u018b\u0184\u0001\u0000\u0000\u0000"+
		"\u018b\u0185\u0001\u0000\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000"+
		"\u018b\u0187\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018c?\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0003\u0000\u0000\u018e"+
		"\u018f\u0003>\u001f\u0000\u018f\u0190\u0005\u0004\u0000\u0000\u0190A\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0007\u0000\u0000\u0000\u0192C\u0001\u0000"+
		"\u0000\u0000\u0019G\\z|\u0082\u008a\u0093\u0096\u009c\u00a4\u00a8\u00ba"+
		"\u00d5\u00e3\u00ec\u00f8\u00fc\u0106\u0125\u0133\u0147\u0173\u0175\u017d"+
		"\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}