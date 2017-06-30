/**
 * 
 */
package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class CompositeEmployee implements EmployeeInfo {

	List<EmployeeInfo> subOrdinates = new ArrayList<EmployeeInfo>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.structural.pattern.composite.EmployeeInfo#print()
	 */
	@Override
	public void print() {
		for (EmployeeInfo emp : subOrdinates) {
			emp.print();
		}

	}

	public void add(EmployeeInfo emp) {
		subOrdinates.add(emp);
	}

	public void remove(EmployeeInfo emp) {
		subOrdinates.remove(emp);
	}

}
