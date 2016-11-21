// Generated from sin.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;

/**
 * This class provides an empty implementation of {@link sinVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class sinBaseVisitorImpl extends sinBaseVisitor<Double>  {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Double visitInput(@NotNull sinParser.InputContext ctx) {
	String sD=ctx.ID().getText();
	Double dD=Double.parseDouble(sD);
	Double res=Math.sin(dD);
	return res;
// return visitChildren(ctx);
 }
}