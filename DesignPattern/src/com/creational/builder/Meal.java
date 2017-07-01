/**
 * 
 */
package com.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class Meal {

private List<Item> items=new ArrayList<Item>();	

public void addItem(Item e)
{
	items.add(e);
}

public float getCost()
{
	float cost=0f;
	for(Item item :items)
	{
		cost+=item.price();
	}
	
	return cost;
}

public void showItems()
{ 
	for(Item item:items)
	{
		System.out.println("Item : "+item.name());
		System.out.println("packing : "+item.packing().pack());
		System.out.println("Price : "+item.price());
	}
}


}
