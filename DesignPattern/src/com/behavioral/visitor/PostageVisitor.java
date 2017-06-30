/**
 * 
 */
package com.behavioral.visitor;

/**
 * @author aprasa03
 *
 */
public class PostageVisitor implements Visitor {
	
	private double totalPostageCost;

	/* (non-Javadoc)
	 * @see com.behavioral.visitor.Visitor#visit(com.behavioral.visitor.Visitable)
	 */
	@Override
	public void visit(Book book) {
		double postageCost=0;
		if(book.getWeight()>2d)
		{
			postageCost+=book.getPrice()*2;
		}
		totalPostageCost+=postageCost;
		System.out.println(book+"\tTotal Postage Cost for Book "+postageCost);

	}

	@Override
	public void visit(DVD dvd) {
		double postageCost=0;
		if(dvd.getWeight()>1d)
		{
			postageCost+=dvd.getPrice()*5;
		}
		totalPostageCost+=postageCost;
		System.out.println(dvd+"\tTotal Postage Cost for DVD "+postageCost);
	}

	/**
	 * @return the totalPostageCost
	 */
	public double getTotalPostageCost() {
		return totalPostageCost;
	}

}
