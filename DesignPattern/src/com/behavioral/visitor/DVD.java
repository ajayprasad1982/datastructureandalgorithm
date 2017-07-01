/**
 * 
 */
package com.behavioral.visitor;

/**
 * @author aprasa03
 *
 */
public class DVD implements Visitable {

	private double price;
	private double weight;
	
	public DVD(double price,double weight)
	{
		this.price=price;
		this.weight=weight;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DVD [price=" + price + ", weight=" + weight + "]";
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
	}

}
