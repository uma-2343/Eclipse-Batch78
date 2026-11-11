package com.Arrays;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.println("main method statred");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the size: ");
		int size=sc.nextInt();
		int numbers[] = new int[size];
		int even = 0;
		int odd = 0;
		System.out.println("enter the number: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=sc.nextInt();
			if (numbers[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}
		System.out.println("even number: " + even);
		System.out.println("odd number:" + odd);

	}

}


//package com.Arrays;
//
//public class Even {
//
//	public static void main(String[] args) {
//		System.out.println("main method statred");
//		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int even = 0;
//		int odd = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//
//		}
//		System.out.println("even number: " + even);
//		System.out.println("odd number:" + odd);
//
//	}
//
//}