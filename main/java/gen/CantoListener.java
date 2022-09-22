package gen;// Generated from C:/CantoLanguage/src/main/java\Canto.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CantoParser}.
 */
public interface CantoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CantoParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CantoParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CantoParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CantoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CantoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(CantoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(CantoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(CantoParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(CantoParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(CantoParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(CantoParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CantoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CantoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CantoParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CantoParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#mutVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterMutVarDecl(CantoParser.MutVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#mutVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitMutVarDecl(CantoParser.MutVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#immutVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterImmutVarDecl(CantoParser.ImmutVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#immutVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitImmutVarDecl(CantoParser.ImmutVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(CantoParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(CantoParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(CantoParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(CantoParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(CantoParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(CantoParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CantoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CantoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CantoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CantoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CantoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CantoParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(CantoParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(CantoParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CantoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CantoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(CantoParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(CantoParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(CantoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(CantoParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(CantoParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(CantoParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(CantoParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(CantoParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqual(CantoParser.LessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqual(CantoParser.LessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(CantoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(CantoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CantoParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CantoParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(CantoParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(CantoParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(CantoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(CantoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqual(CantoParser.GreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqual(CantoParser.GreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CantoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CantoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(CantoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(CantoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CantoParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CantoParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(CantoParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(CantoParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(CantoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(CantoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CantoParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CantoParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(CantoParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(CantoParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(CantoParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(CantoParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CantoParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CantoParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDiv}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntDiv(CantoParser.IntDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDiv}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntDiv(CantoParser.IntDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterXor(CantoParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitXor(CantoParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CantoParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CantoParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(CantoParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(CantoParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CantoParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CantoParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CantoParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CantoParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CantoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CantoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CantoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CantoParser.BoolContext ctx);
}