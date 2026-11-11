package com.Arrays;

public class Positive {
	public static void main(String[] args) {
		System.out.println("main method statred");
		int numbers[]= {1,-2,4,-8,6,9,-7};
		int positive=0;
		int negative=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				positive++;
			}else {
				negative++;
			}
		}
		System.out.println("positive numbers: "+positive);
		System.out.println("Negative numbers: "+negative);

	}

 
}
