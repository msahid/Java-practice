package mscode.arrays;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        System.out.println("Enter 5 Values");
        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        System.out.println("Enter Value to search");

        int key = sc.nextInt();
        if (search(n,key)){
            System.out.println("Found");
        }else
            System.out.println("Not Found");

    }

     static boolean search(int[] n, int key) {
        boolean isFound = false;
        for ( int i=0; i < n.length; i++){
            if (key == n[i]){
                isFound = true;
                break;
            }

        }
        return isFound;

    }
}
