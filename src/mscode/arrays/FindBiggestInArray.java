package mscode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindBiggestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        System.out.println("Enter 5 Values");
        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println("Given Array "+Arrays.toString(n));

        System.out.println("Biggest Element "+n[n.length-1]);
        System.out.println("2nd Biggest Element "+n[n.length-2]);
        System.out.println("Smallest Element "+n[0]);
        System.out.println("2nd Smallest Element "+n[1]);

    }

}
