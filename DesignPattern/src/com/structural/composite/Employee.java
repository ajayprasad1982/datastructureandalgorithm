/**
 * 
 */
package com.structural.composite;

/**
 * @author aprasa03
 *
 */
public class Employee  implements EmployeeInfo{
	
	private String name;
	private String dept;
	private int salary;
	
	public Employee(String name,String dept,int salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void print() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}

	
}
