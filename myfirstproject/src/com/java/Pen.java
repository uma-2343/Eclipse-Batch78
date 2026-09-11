package com.java;

public class Pen {
	
	public static void main(String[] args) {
		int money = 100;
		int pencilcost = 7;
		int pencils = money/pencilcost;
		int balance = money%pencilcost;
		System.out.println("pencils:"+pencils);
		System.out.println("balnce:"+balance);
	}

}
