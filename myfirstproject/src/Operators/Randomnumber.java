package Operators;

import java.util.Random;
import java.util.Scanner;

public class Randomnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rs = new Random();
		int rn = rs.nextInt(10) + 1;
		int guess;
		int chances = 1;
		while (chances <= 3) {
			System.out.println("Guess a number between 1 to 100");
			guess = sc.nextInt();
			if (guess == rn) {
				System.out.println("Congratulations! You guessed the correct number.");
				break;
			} else if (chances > 3) {
				System.out.println("Game over: " + rn);
			}

			else if (guess < rn) {
				System.out.println("Too Low! Try Again.");

			} else {
				System.out.println("To high! Try again.");

			}
			chances++;
		}
//		if (chances > 3) {
//			System.out.println("Game over: "+rn);
//		}
//
	}
}
