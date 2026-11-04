//fibbonicci
////package Operators;
//import java.util.Scanner;
//public class Test4 {
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int n=sc.nextInt();
//		int n1=0;
//		int n2=1;
//		for(int i=1;i<=n;i++) {
//			System.out.print(n1+" "+n2);
//			int n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
//		System.out.println("main method ended");
//	}
//
//}

package Operators;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        for(int i = 1; i <= n; i++) {

            System.out.print(n1 + " ");

            int n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
        }

        System.out.println("main method ended");
        sc.close();
    }
}
