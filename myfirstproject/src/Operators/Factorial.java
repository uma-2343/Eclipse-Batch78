package Operators;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		findfactorial(n);
		System.out.println("main method ended");
					}
	
static void findfactorial(int n) {
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}

}
