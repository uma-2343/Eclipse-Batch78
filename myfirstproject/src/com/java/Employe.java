package com.java;

public class Employe {
	int empid=7440;
	byte age=21;
	double sal=45000.00;
	char grade='A';
	float experience=5.0F;
	boolean active=true;
	short leaves=10;
	long phone=9392819338L;
	
	
	void display() {
		System.out.println("employe id: "+empid);
		System.out.println("employe age: "+age);
		System.out.println("employe sal: "+sal);
		System.out.println("employe grade: "+grade);
		System.out.println("employe experience: "+experience);
		System.out.println("employe active: "+active);
		System.out.println("employe leaves: "+leaves);
		System.out.println("employe phone number: "+phone);	
	}
	public static void main(String[] args) {
		Employe e1=new Employe();
			e1.display();
		}
	

	}
	
	


