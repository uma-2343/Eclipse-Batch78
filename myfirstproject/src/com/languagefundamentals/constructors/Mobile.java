package com.languagefundamentals.constructors;

public class Mobile {

    String model;
    int quantity;
    double price;
    double deliveryCharge;
    double mobileCost;
    double finalBill;

    Mobile() {
        this("unknown");
    }

    Mobile(String model) {
        this(model, 0);
    }

    Mobile(String model, int quantity) {
        this(model, quantity, 0.0);
    }

    Mobile(String model, int quantity, double price) {
        this(model, quantity, price, 0.0);
    }

    Mobile(String model, int quantity, double price,
           double deliveryCharge) {

        System.out.println("Four arg constructor called");

        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharge = deliveryCharge;

        mobileCost = price * quantity;
        finalBill = mobileCost + deliveryCharge;
    }

    void mobileInfo() {
        System.out.println("****************************");
        System.out.println("Mobile Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Mobile Cost : " + mobileCost);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Final Bill : " + finalBill);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");
        System.out.println("Welcome to Vcube Mobile Showroom");

        Mobile m = new Mobile();
        m.mobileInfo();

        //Mobile m1 = new Mobile("Samsung");
        //m1.mobileInfo();

        //Mobile m2 = new Mobile("iPhone", 2);
        //m2.mobileInfo();

        //Mobile m3 = new Mobile("Vivo", 3, 15000);
        //m3.mobileInfo();

        //Mobile m4 = new Mobile("OnePlus", 2, 30000, 200);
        //m4.mobileInfo();

        System.out.println("Main method ended");
    }
}