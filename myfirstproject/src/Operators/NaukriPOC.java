package Operators;

import java.util.Scanner;

public class NaukriPOC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Naukri Job Portal");

        System.out.print("Are you graduated? (yes/no): ");
        String graduate = sc.nextLine();

        if (graduate.equalsIgnoreCase("yes")) {

            System.out.print("Do you know Java? (yes/no): ");
            String skills = sc.nextLine();

            if (skills.equalsIgnoreCase("yes")) {

                System.out.print("Do you know SQL? (yes/no): ");
                String sql = sc.nextLine();

                if (sql.equalsIgnoreCase("yes")) {

                    System.out.print("Are you willing to relocate? (yes/no): ");
                    String relocate = sc.nextLine();

                    if (relocate.equalsIgnoreCase("yes")) {

                        System.out.print("Are you willing to work in shifts? (yes/no): ");
                        String shifts = sc.nextLine();

                        if (shifts.equalsIgnoreCase("yes")) {
                            System.out.println("Congratulations! You are eligible for the job.");
                        } else {
                            System.out.println("You can apply for day-shift jobs.");
                        }

                    } else {
                        System.out.println("Search for jobs in your preferred location.");
                    }

                } else {
                    System.out.println("Learn SQL to improve your job opportunities.");
                }

            } else {
                System.out.println("Learn Java to apply for developer jobs.");
            }

        } else {
            System.out.println("Complete your graduation first.");
        }

        sc.close();
    }
}
