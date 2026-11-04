package Operators;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int f=fact(n);
		System.out.println("factorial of given: "+f);
		
	}
 static int fact(int n) {
	 if(n==0||n==1) {
		 return 1;
		 
	 }
	 return n*(fact(n-1));
 }
}
