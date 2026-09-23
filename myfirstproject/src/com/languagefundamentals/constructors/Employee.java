package com.languagefundamentals.constructors;

public class Employee {
	int id;
	String name;
	double sal;

	Employee() {
		id = 101;
		name = "uma";
		sal = 10000;
	}

	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

	}

	public static void main(String[] args) {
		System.out.println("main mathod started.");
		Employee e1 = new Employee();
		e1.id = 103;
		e1.name = "ram";
		e1.sal = 30000;
		e1.employeinfo();
		Employee e2 = new Employee(102, "naveen", 200000);
		e2.employeinfo();
		Employee e3 = new Employee();
		e3.employeinfo();

	}

	void employeinfo() {
		System.out.println("**************emp info****************");
		System.out.println("employee id: " + id);
		System.out.println("employee name: " + name);
		System.out.println("employee sal: " + sal);

	}
}
