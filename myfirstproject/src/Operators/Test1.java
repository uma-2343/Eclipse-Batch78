package Operators;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		System.out.println("mian method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Buzz&Fizz");
			}
			else if(i%3==0) {
				System.out.println("Buzz");
			}


			else if(i%5==0) {
				System.out.println("Fizz");
			}
		    else  {
				System.out.println(i);
			}
		
		}
		System.out.println("mian method ended");
		
		
	}

}
