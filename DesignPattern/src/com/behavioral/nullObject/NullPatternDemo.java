package com.behavioral.nullObject;

public class NullPatternDemo {

	public static void main(String[] args) {

	AbstractCustomer cust1=CustomerFactory.getCustomer("Ajay");
	AbstractCustomer cust2=CustomerFactory.getCustomer("Imran");	
	AbstractCustomer cust3=CustomerFactory.getCustomer("Dibya");	
	AbstractCustomer cust4=CustomerFactory.getCustomer("Vijay");	
		
	System.out.println("Customers Info");
	System.out.println(cust1.getName());
	System.out.println(cust2.getName());
	System.out.println(cust3.getName());
	System.out.println(cust4.getName());
	
		
	}

}
