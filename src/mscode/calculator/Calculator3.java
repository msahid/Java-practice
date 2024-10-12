package mscode.calculator;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        System.out.println("Welcome to the calculator");
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = input.nextInt();

        System.out.println("1 to add, 2 to subtract, 3 to multiply, 4 to divide");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result of addition: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result of subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result of multiplication: " + (num1 * num2));
                break;
            case 4:
                double result = (double) num1 / (double) num2;
                System.out.println("Result of division: " + result);
                break;


        }
        System.out.println("Thank you for using my calculator.");
    }
}
