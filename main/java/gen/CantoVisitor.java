package gen;// Generated from C:/CantoLanguage/src/main/java\Canto.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CantoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CantoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CantoParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CantoParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CantoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#listConcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConcat(CantoParser.ListConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#listIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndex(CantoParser.ListIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(CantoParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(CantoParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(CantoParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVarDecl}
	 * labeled alternative in {@link CantoParser#classVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDecl(CantoParser.ClassVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVarInit}
	 * labeled alternative in {@link CantoParser#classVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarInit(CantoParser.ClassVarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#classMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(CantoParser.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Public}
	 * labeled alternative in {@link CantoParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublic(CantoParser.PublicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Private}
	 * labeled alternative in {@link CantoParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate(CantoParser.PrivateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CantoParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(CantoParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(CantoParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CantoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CantoParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#mutVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutVarDecl(CantoParser.MutVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#immutVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutVarDecl(CantoParser.ImmutVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#immutListDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmutListDecl(CantoParser.ImmutListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#mutListDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutListDecl(CantoParser.MutListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(CantoParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(CantoParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(CantoParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CantoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CantoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CantoParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(CantoParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#forRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRange(CantoParser.ForRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#forEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(CantoParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CantoParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CantoParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(CantoParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(CantoParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CantoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqual(CantoParser.LessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CantoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CantoParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(CantoParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CantoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(CantoParser.GreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CantoParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(CantoParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CantoParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(CantoParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(CantoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CantoParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(CantoParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(CantoParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CantoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDiv}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDiv(CantoParser.IntDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(CantoParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CantoParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link CantoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(CantoParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CantoParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(CantoParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CantoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(CantoParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CantoParser.BoolContext ctx);
}