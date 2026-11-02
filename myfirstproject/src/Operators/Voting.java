package Operators;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Voting Portal");
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Are you an indian citizen?(true/false)");
		boolean citizen = sc.nextBoolean();
		if(age >=0) {
			if(age >=18) {	
				if(citizen) {
					System.out.println("Elgible to Vote");
				}
				else {
					System.out.println("Not Elible to vote");
				}
			}
			else {
				System.out.println("Not eligible to vote");
			}
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
		