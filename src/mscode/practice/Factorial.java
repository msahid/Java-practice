package mscode.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to find Factor");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
                long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
