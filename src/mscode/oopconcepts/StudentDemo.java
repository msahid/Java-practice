package mscode.oopconcepts;

import java.util.Scanner;

class Student {
    private int rollNum;
    private String studName;
    private double mark1;
    private double mark2;
    private double mark3;
    private double totalMarks;
    private double average;

    // Method to set student details
    public void setStudDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNum = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter Student Name: ");
        studName = scanner.nextLine();

        System.out.print("Enter Mark 1: ");
        mark1 = scanner.nextDouble();

        System.out.print("Enter Mark 2: ");
        mark2 = scanner.nextDouble();

        System.out.print("Enter Mark 3: ");
        mark3 = scanner.nextDouble();
    }

    // Method to calculate total marks
    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }

    public void average() {
        average = ((mark1+mark2+mark3) / 3.0) ;
    }

    // Method to display student details
    public void displayStudDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create an instance of Student class
        Student student = new Student();

        // Set student details using the setStudDetails() method
        student.setStudDetails();

        // Calculate total marks using the calculateTotal() method
        student.calculateTotal();

        // Display student details using the displayStudDetails() method
        student.displayStudDetails();
    }
}
