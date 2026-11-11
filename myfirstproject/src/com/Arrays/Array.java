//package com.Arrays;
//
//public class Array {
//
//	public static void main(String[] args) {
//		System.out.println("main method stared");
//		int arr[]= {1,0,2,0,6,9,0,0,6,0,0};
//		int n=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				System.out.println(arr[i]+"");	
//				n++;
//			}
//		}
//		for(int i=0;i<arr.length-n;i++) {
//			System.out.println("0");
//		}
//	}
//	
//}

package com.Arrays;

public class Array {

	public static void main(String[] args) {
		System.out.println("main method stared");
		int arr[] = { 1, 0, 2, 0, 6, 9, 0, 0, 6, 0, 0 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;

				j++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}