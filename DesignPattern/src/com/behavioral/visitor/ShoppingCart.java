/**
 * 
 */
package com.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class ShoppingCart {
	
private List<Visitable> items=new ArrayList<Visitable>();


public double calculatePostage()
{
	PostageVisitor visitor=new PostageVisitor();
	
	for(Visitable item:items)
	{
		item.accept(visitor);
	}
	double postage=visitor.getTotalPostageCost();
	return postage;
}

public void addItems(Visitable visitable)
{
	items.add(visitable);
}


	

}
