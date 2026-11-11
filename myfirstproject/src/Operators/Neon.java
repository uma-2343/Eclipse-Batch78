package Operators;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enrer a number: ");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0) {
			int p=n*n;
			n=p/10;
			sum=p+n;
			
		}
		n=sum;
		if(temp==n) {
			System.out.println("neon number");
			
		}else {
			System.out.println("not neon number");
		}
		
	}

}
