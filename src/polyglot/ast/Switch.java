/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * This file was originally derived from the Polyglot extensible compiler framework.
 *
 *  (C) Copyright 2000-2007 Polyglot project group, Cornell University
 *  (C) Copyright IBM Corporation 2007-2014.
 */

package polyglot.ast;

import java.util.List;

/**
 * A <code>Switch</code> is an immutable representation of a Java
 * <code>switch</code> statement.  Such a statement has an expression which
 * is evaluated to determine where to branch to, an a list of labels
 * and block statements which are conditionally evaluated.  One of the
 * labels, rather than having a constant expression, may be lablled
 * default.
 */
public interface Switch extends CompoundStmt 
{
    /** The expression on which to switch. */
    Expr expr();

    /** Set the expression on which to switch. */
    Switch expr(Expr expr);

    /** List of switch elements: case statements or blocks.
     * @return A list of {@link polyglot.ast.SwitchElement SwitchElement}.
     */
    List<SwitchElement> elements();

    /** Set the list of switch elements: case statements or blocks.
     * @param elements A list of {@link polyglot.ast.SwitchElement SwitchElement}.
     */
    Switch elements(List<SwitchElement> elements);
}