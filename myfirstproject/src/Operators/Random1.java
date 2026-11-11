package Operators;

import java.util.Random;
import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		System.out.println("main method stareted");
		Scanner sc=new Scanner(System.in);
		Random rs=new Random();
		int rn=rs.nextInt(10)+1;
		int chances=1;
		
		for(int i=0;i<3;i++) {
			System.out.println("Guess the number: ");
			int guess=sc.nextInt();

			if(guess==rn) {
				System.out.println("Congratulations! You guessed the correct number.");
				break;
			}
			else if(guess<rn) {
				System.out.println("To Low!");
			}else {
				System.out.println("to High!");
			}
			chances++;
			
		}
		if(chances>3) {
			System.out.println("Game Over..!");
		}
		
	}

}
