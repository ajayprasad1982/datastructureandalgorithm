/**
 * 
 */
package com.data.structure.stack;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class Stack {
	int top = -1;
	Integer dataSize;
	Integer[] value=null;

	
	
	/**
	 * @param dataSize
	 */
	public Stack(Integer dataSize) {
		this.dataSize = dataSize;
		value = new Integer[dataSize];
	}

	private Boolean isFull() {
		return top == dataSize - 1;
	}

	public Boolean isEmpty() {
		return top == -1;
	}

	private Integer getNextPosition() {
		return ++top;
	}

	public void push(Integer val) {
		if (isFull())
			return;
		value[getNextPosition()] = val;
	}

	public Integer pop() {
		Integer val = null;
		if (isEmpty())
			return val;
		val = value[top];
		value[top] = null;
		--top;
		return val;
	}

	public Integer getTop() {
		return top;
	}

	@Override
	public String toString() {
		return "Stack =" + Arrays.toString(value);
	}

}
