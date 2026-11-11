package Operators;

import java.util.Scanner;

public class Fibonic {

	public static void main(String[] args) {
		System.out.println("main method stared");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
			
	
		}
	}

}
