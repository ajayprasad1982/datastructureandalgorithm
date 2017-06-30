/**
 * 
 */
package com.data.structure.binary.tree;

/**
 * @author aprasa03
 *
 * Feb 4, 2015
 */
public class IntervalNode {
private IntervalNode left;
private IntervalNode right;
private Integer low;
private Integer high;
private Integer max;



/**
 * @param low
 * @param high
 */
public IntervalNode(Integer low, Integer high) {
	super();
	this.low = low;
	this.high = high;
	this.max=high;
}
/**
 * @return the left
 */
public IntervalNode getLeft() {
	return left;
}
/**
 * @param left the left to set
 */
public void setLeft(IntervalNode left) {
	this.left = left;
}
/**
 * @return the right
 */
public IntervalNode getRight() {
	return right;
}
/**
 * @param right the right to set
 */
public void setRight(IntervalNode right) {
	this.right = right;
}
/**
 * @return the low
 */
public Integer getLow() {
	return low;
}
/**
 * @param low the low to set
 */
public void setLow(Integer low) {
	this.low = low;
}
/**
 * @return the high
 */
public Integer getHigh() {
	return high;
}
/**
 * @param high the high to set
 */
public void setHigh(Integer high) {
	this.high = high;
}
/**
 * @return the max
 */
public Integer getMax() {
	return max;
}
/**
 * @param max the max to set
 */
public void setMax(Integer max) {
	this.max = max;
}
	

}
