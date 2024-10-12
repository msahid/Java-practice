package mscode.conditionalstatement.ifelse;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Enter Your age:  ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        
        if (age > 0 && age < 13){
            System.out.println("Child");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else  {
            //age >= 18 always adult
            System.out.println("adult: drive, vote");
        }
       /* else {
            System.out.println("out of range");
        }
        */

    }
}
