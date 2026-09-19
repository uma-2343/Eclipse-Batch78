package com.languagefundamentals.methods;

//2) Method with no return type + with parameters 
//WAP to calculate the values based on your input..
public class TestMethodsDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		
		int a=40;
        int b=20;
        addition(a,b);

		System.out.println("main method ended ");
	}

	static void addition(int a, int b) {
		System.out.println("addition method called ");// sum
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called ");// Difference
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called ");// Product
		System.out.println(a * b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called ");// 98%5 = 3 Reminder
		System.out.println(a % b);
	}

	static void division(int a, int b) {
		System.out.println("Division method called ");// Quotient
		System.out.println(a / b);//19
	}
	static void average(int a, int b) {
		System.out.println("Average method called ");// Quotient
		System.out.println((a+b/2));//19
}
	static void square(int n) {
		System.out.println("square method called ");// Quotient
		System.out.println(n*n);
	}
	static void cube(int n) {
		System.out.println("cube method called ");// Quotient
		System.out.println(n*n*n);
	}
	static void doublevalue(int n) {
		System.out.println("doublevalue method called ");// Quotient
		System.out.println(n*2);
	}
	static void halfvalue(int n) {
		System.out.println("halfvalue method called ");// Quotient
		System.out.println(n/2);
	}
	static void equal(int a,int b) {
		System.out.println("equal method called ");// Quotient
		System.out.println(a = b);
	}
	static void greater(int a,int b) {
		System.out.println("greater method called ");// Quotient
		System.out.println(a>b);
	}
	static void lessthan(int a,int b) {
		System.out.println("lessthan method called ");// Quotient
		System.out.println(a<b);
	}
	
}