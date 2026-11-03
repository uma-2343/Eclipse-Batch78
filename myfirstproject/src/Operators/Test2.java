package Operators;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what table to you want: ");
		int n=sc.nextInt();
		System.out.println(" how many times you want to multiple : ");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n+" x "+ i +" = "+(n*i));
		}
		
		
	}

}
