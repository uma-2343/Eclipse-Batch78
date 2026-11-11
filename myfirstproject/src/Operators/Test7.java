package Operators;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=n;
		int rem;
		int temp=n;
		
		while(temp>9) {
			sum=0;
			while(temp>0) {
				rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			temp=sum;
		}
		if(temp==1) {
		System.out.println("magic");
 	
	}else {
		System.out.println("not magic");
	}

}
}
