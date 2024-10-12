package mscode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] n = new int [5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 5 values");

        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
            sum += n[i];
        }
        System.out.println("Sum of Array" + Arrays.toString(n) +" = " + sum);
    }
}
