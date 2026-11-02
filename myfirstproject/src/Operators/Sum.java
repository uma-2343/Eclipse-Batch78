package Operators;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	System.out.println("main method staretd");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++) {
    	if(i%3==0 && i%5==0) {
    		sum=sum+i;
    	}
    }
    System.out.println("SUM of numbers: "+sum);
    System.out.println("main method ended");
	}

}
