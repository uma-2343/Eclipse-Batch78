package com.languagefundamentals.methods;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	Product(int productId,String productName,double price,int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	Product(Product p){
		this.productId=p.productId;
		this.productName=p.productName;
		this.price=p.price;
		this.quantity=p.quantity;

	}
	double calculatetotal(){
		return price*quantity;
		
	}
	public static void main(String[] args) {
		Product p1=new Product(1,"UMA",200,1);
		
		

		Product p2=new Product(p1);
		p2.quantity=3;
	
		System.out.println("total price of product1: "+p1.calculatetotal());
		System.out.println("total price of product2: "+p2.calculatetotal());
		System.out.println("product quantity: "+p1.quantity);
		
		System.out.println("product quantity: "+p2.quantity);
		
		
	}
}


