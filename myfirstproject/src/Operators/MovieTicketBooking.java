package Operators;
import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=0;
		String movie=" ";
		System.out.println("----------------------------------");
		System.out.println("Welcome to Move Booking");
		System.out.println("----------------------------------");
		
		System.out.println("1. Pushpa 2   - Rs. 200");
        System.out.println("2. Devara     - Rs. 180");
        System.out.println("3. Kalki 2898 AD - Rs. 250");
        System.out.println("4. Exit");

        
        System.out.println(" Enter your movie : ");
        int choice=sc.nextInt();
        
        switch (choice) {

        case 1 -> {
            movie = "Pushpa 2";
            price = 200;
        }
        case 2 -> {
            movie = "Devara";
            price = 180;
        }
        case 3 -> {
            movie = "Kalki 2898 AD";
            price = 250;
        }
        case 4 -> {
            System.out.println("Thank you! Visit again.");
            sc.close();
            return;
        }

        default -> {
            System.out.println("Invalid movie selection!");
            sc.close();
            return;
        }
       }
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= 0) {
            System.out.println("Invalid ticket quantity!");
        } else {
            int total = price * tickets;

            System.out.println("\n===== BOOKING DETAILS =====");
            System.out.println("Movie Name: " + movie);
            System.out.println("Ticket Price: Rs. " + price);
            System.out.println("Number of Tickets: " + tickets);
            System.out.println("Total Amount: Rs. " + total);
            System.out.println("Booking Successful!");

        }		
	}

}
