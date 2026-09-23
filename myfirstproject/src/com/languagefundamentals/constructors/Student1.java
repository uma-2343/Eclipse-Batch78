package com.languagefundamentals.constructors;

public class Student1 {
	static int count = 0;

  Student1(){
	  count ++;
	 }
	public static void main(String[] args) {
		System.out.println("main method started");
		Student1 s = new Student1();
		Student1 s1 = new Student1();
		Student1 s2= new Student1();
		Student1 s3= new Student1();
		System.out.println("count: "+count);
       	
	}
}
