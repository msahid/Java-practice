package mscode.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator to add");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
         double number1 = input.nextDouble();

        System.out.println("Enter Number 2: ");
        double number2 = input.nextDouble();

        double result = number1 + number2;

        System.out.println("Result = " + result);
    }
}
