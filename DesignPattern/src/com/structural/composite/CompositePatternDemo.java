/**
 * 
 */
package com.structural.composite;

/**
 * @author aprasa03
 *
 */
public class CompositePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CompositeEmployee compositeEmployee=new CompositeEmployee();
		CompositeEmployee compositeEmployee1=new CompositeEmployee();
		CompositeEmployee compositeEmployee2=new CompositeEmployee();
		CompositeEmployee compositeEmployee3=new CompositeEmployee();
		
		  Employee CEO = new Employee("John","CEO", 30000);

	      Employee headSales = new Employee("Robert","Head Sales", 20000);

	      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

	      Employee clerk1 = new Employee("Laura","Marketing", 10000);
	      Employee clerk2 = new Employee("Bob","Marketing", 10000);

	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
	      
	      compositeEmployee.add(CEO);
	      compositeEmployee1.add(headSales);
	      compositeEmployee1.add(headMarketing);
	      
	      compositeEmployee2.add(salesExecutive1);
	      compositeEmployee2.add(salesExecutive2);
	      
	      compositeEmployee3.add(clerk1);
	      compositeEmployee3.add(clerk2);
	      compositeEmployee.add(compositeEmployee1);
	      compositeEmployee1.add(compositeEmployee2);
	      compositeEmployee2.add(compositeEmployee3);
	      
	     
	      
	      
	      compositeEmployee.print();

	}

}
