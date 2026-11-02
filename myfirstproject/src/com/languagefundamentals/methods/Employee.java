package com.languagefundamentals.methods;
class Employee {

    int id;
    String name;
    double salary;

        Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

        double calculateBonus() {
        return salary * 0.10;
    }

        
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ravi", 30000);

        e1.displayDetails();
    }
    void displayDetails() {
        double bonus = calculateBonus();
        double finalSalary = salary + bonus;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }

}