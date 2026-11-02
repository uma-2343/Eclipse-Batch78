

package Operators;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade = (marks < 0 || marks > 100) ? "Invalid marks"
                : (marks >= 90) ? "A Grade"
                : (marks >= 80) ? "B Grade"
                : (marks >= 70) ? "C Grade"
                : (marks >= 60) ? "D Grade"
                : "Fail";

        System.out.println(grade);

        sc.close();
    }
}
