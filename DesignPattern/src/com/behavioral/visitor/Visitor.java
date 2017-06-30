/**
 * 
 */
package com.behavioral.visitor;

/**
 * @author aprasa03
 *
 */
public interface Visitor {
	public void visit(Book book);
	public void visit(DVD dvd);

}
