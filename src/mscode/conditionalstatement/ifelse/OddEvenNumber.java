package mscode.conditionalstatement.ifelse;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number to check if odd: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

// ternary operator (instead of if else)
        String answer = (num % 2 == 0 ) ? "Even" :"Odd";
        System.out.println(answer);

/*
        if (num % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd");
        }
*/


    }
}
