package com.languagefundamentals.constructors;

class Vechile {
	Vechile(){
		System.out.println("constructer called from vechile");
	}
	public static void main(String[] args) {
		System.out.println("main method started from vechile ");
	}
}

public class Bike extends Vechile {
	String model;
	String brand;
	double price;
	Bike(){
		System.out.println("constructor called from bike"
				+ "");
	}
	public static void main(String[] args) {
		System.out.println("main method started from Bike ");
		Bike b1= new Bike();
		b1.bikeinfo();
		
		
		}
void bikeinfo() {
	System.out.println("bike model :"+model);
	System.out.println("bike Brand:"+brand);
	System.out.println("bike price :"+price);


	
}

}
