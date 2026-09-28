package com.languagefundamentals.constructors;


public class Cmobilebill {
	String  model;
	int price;
	int quantity;
	int mcost;
	int dcharge;
	int finalbill;
	Cmobilebill(){
		this("oppof21");
	}
	Cmobilebill(String model){
		this(model,21000);
		System.out.println("1st arg");
		
	}
	Cmobilebill(String model,int price){
		this(model,price,1);
		System.out.println("2nd arg");
		
	}
	Cmobilebill(String model,int price,int quantity){
		this(model,price,quantity,300000);
		System.out.println("3rd arg");
		
	}
	Cmobilebill(String model,int price,int quantity,int mcost){
		this(model,price,quantity,mcost,200);
		System.out.println("4th arg");
	}
	Cmobilebill(String model,int price,int quantity,int mcost,int dcharge){
		this(model,price,quantity,mcost,200,250000);
		System.out.println("5th arg");
		
		
	}
	Cmobilebill(String model,int price,int quantity,int mcost,int dcharge,int finalbill){
		this.model=model;
		this.price=price;
		this.quantity=quantity;
		this.mcost=mcost;
		this.dcharge=dcharge;
		this.finalbill=finalbill;
		mcost = price*quantity;
		finalbill = mcost + dcharge;
	}
	

	public static void main(String[] args) {
		Cmobilebill c=new Cmobilebill();
		c.display();
		
		
	}
	 void display() {
		 System.out.println("mobile model:"+model);
		 System.out.println("mobile price:"+price);
		 System.out.println("mobile quantity:"+quantity);
		 System.out.println("mobile cost:"+mcost);
		 System.out.println("mobile delivery charge:"+dcharge);
		 System.out.println("mobile final bill:"+finalbill);
	 }

	}