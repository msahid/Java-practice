package assaingments.conditonalstatement;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //ternary operator
        //? variable = condition ? statement 1 : statement 2

        //Check if a student will pass or fail
        //marks  >= 33 : pass
        //marks < 33 : fail

        System.out.println("Enter marks to check: ");
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();

        String result = (mark >= 33) ?"Pass" : "Fail";
        System.out.println(result);
    }
}
