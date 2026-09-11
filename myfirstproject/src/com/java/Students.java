package com.java;

public class Students {

	static String college = "DSU";
	int age = 22;
	String name = "Uma";
	void display() {
		System.out.println("college name :"+ college);
		System.out.println("student name :"+ name);
		System.out.println("student age :"+ age);	
		
	}
	
	
	public static void main(String[] args) {
		Program s1 =new Program();
		s1.display();
	
	}
}
