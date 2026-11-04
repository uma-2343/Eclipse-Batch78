
package Operators;

import java.util.Scanner;

public class Test5 {

    static boolean isprime(int n) {
    	boolean status=true;

        if(n == 0 || n == 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return status;
    }

    public static void main(String[] args) {

        System.out.println("Main method started.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int n = sc.nextInt();
        int count=0;
        System.out.println(" enter which number you want: ");
        int n1=sc.nextInt();
        

        for(int i = 0; i <= n; i++) {
            if(isprime(i)) {
            	count++;
            	if(count==n1) {
            		 System.out.println(i+" -"+count);
            	}
               
            }
        }

        sc.close();
    }
}
