package mscode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] n = new int[size];

        System.out.println("Enter " + size + " values");

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();

        }
        System.out.println("Giver Array elements");

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        System.out.println("Elements using foreach");
        for (int x : n){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(n));
    }
}
