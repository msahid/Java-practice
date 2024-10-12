package mscode.conditionalstatement.switchtopic;

import mscode.calculator.Calculator3;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        //Calculator3.calculator();

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Num 1: ");
        int num1 = input.nextInt();

        System.out.println( " Enter Num 2: ");
        int num2 = input.nextInt();

        System.out.println(" Enter operator: ");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                double result =  (double) num1 / (double) num2;
                System.out.println(result);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Try different operator.");
        }

    }
}
