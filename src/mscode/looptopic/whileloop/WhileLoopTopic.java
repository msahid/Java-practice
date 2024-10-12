package mscode.looptopic.whileloop;

import java.util.Scanner;

public class WhileLoopTopic {
    public static void main(String[] args) {
/*        for ( int i = 0; i < 10 ; i++){
            System.out.println(i+1+" I am learning loop");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want loops to run: ");
        int range = sc.nextInt();

        int start = 1;
        while (start <= range) {
            System.out.println(start + ": I am learning while loop. ");
            start++;

        }
    }
}
