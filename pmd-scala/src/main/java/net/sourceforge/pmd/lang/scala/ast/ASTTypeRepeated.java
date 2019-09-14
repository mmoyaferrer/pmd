/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Type;

/**
 * The ASTTypeRepeated node implementation.
 */
public class ASTTypeRepeated extends AbstractScalaNode<Type.Repeated> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTTypeRepeated(Type.Repeated scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
