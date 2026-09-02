package com.java;

public class Institute{

    // Static variable
    static String Trianername1;
    static String Trianername2;

    // Instance variables
    String EmployeeName;
    String Employeedesignation;
    int EmployeeId;
    

    public static void main(String[] args) {

        // Assign value to static variable
        Trianername1 = "Srikanth";
        Trianername2 = "vishwanth";

        // Create object
        Institute s1 = new Institute();

        // Assign values to instance variables
        s1.EmployeeName = "Uma Maheswari";
        s1.EmployeeId = 101;
        s1.Employeedesignation = "lab staf";

        // Accessing variables
        System.out.println("Trainername1: " + Trianername1);
        System.out.println("Trainername2: " + Trianername2);
        System.out.println("Employee Name: " + s1.EmployeeName);
        System.out.println("Employee ID: " + s1.EmployeeId);
        System.out.println("Employee Designation: " + s1.Employeedesignation);
        
        Institute s2 = new Institute();

        // Assign values to instance variables
        s2.EmployeeName = "Chaithu";
        s2.EmployeeId = 101;
        s2.Employeedesignation = "lab staf";

        // Accessing variables
        System.out.println("Trainername1: " + Trianername1);
        System.out.println("Trainername2: " + Trianername2);
        System.out.println("Employee Name: " + s2.EmployeeName);
        System.out.println("Employee ID: " + s2.EmployeeId);
        System.out.println("Employee Designation: " + s2.Employeedesignation);
        
        Institute s3 = new Institute();

        // Assign values to instance variables
        s3.EmployeeName = "sathvi";
        s3.EmployeeId = 101;
        s3.Employeedesignation = "lab staf";

        // Accessing variables
        System.out.println("Trainername1: " + Trianername1);
        System.out.println("Trainername2: " + Trianername2);
        System.out.println("Employee Name: " + s3.EmployeeName);
        System.out.println("Employee ID: " + s3.EmployeeId);
        System.out.println("Employee Designation: " + s3.Employeedesignation);
        
    }
}
        
        
        