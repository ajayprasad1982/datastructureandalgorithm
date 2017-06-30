/**
 * 
 */
package com.greedy.programming.example;

/**
 * @author aprasa03
 *
 * Feb 17, 2015
 */
public class Job  implements Comparable<Job>{
 char id;
 int deadLine;
 int profit;
 
 
 
 
/**
 * @param id
 * @param deadLine
 * @param profit
 */
public Job(char id, int deadLine, int profit) {
	super();
	this.id = id;
	this.deadLine = deadLine;
	this.profit = profit;
}
/**
 * @return the id
 */
public char getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(char id) {
	this.id = id;
}
/**
 * @return the deadLine
 */
public int getDeadLine() {
	return deadLine;
}
/**
 * @param deadLine the deadLine to set
 */
public void setDeadLine(int deadLine) {
	this.deadLine = deadLine;
}
/**
 * @return the profit
 */
public int getProfit() {
	return profit;
}
/**
 * @param profit the profit to set
 */
public void setProfit(int profit) {
	this.profit = profit;
}
/* (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
@Override
public int compareTo(Job o) {
	
	return o.profit-this.profit;
}
	
}
