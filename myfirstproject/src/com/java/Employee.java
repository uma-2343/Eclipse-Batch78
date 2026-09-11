package com.java;

public class Employee {
	static int count = 0;
	static
	{
		System.out.println("static block called");
		
	}
	{
	System.out.println("instance block called");
	count++;

	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		System.out.println(count);


		
	
	
	}

}
