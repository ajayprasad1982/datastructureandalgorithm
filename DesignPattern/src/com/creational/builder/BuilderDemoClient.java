/**
 * 
 */
package com.creational.builder;

/**
 * @author aprasa03
 *
 */
public class BuilderDemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	MealBuilder builder=new MealBuilder();
Meal vegMeal=builder.prepareVegMeal();
System.out.println("Veg meal");
vegMeal.showItems();
System.out.println("Total Cost\t"+vegMeal.getCost());
Meal nonVegMeal=builder.prepareNonVegMeal();
System.out.println("Non Veg meal");
nonVegMeal.showItems();
System.out.println("Total Cost\t"+nonVegMeal.getCost());


	}

}
