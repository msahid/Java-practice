package mscode.conditionalstatement.switchtopic;

import java.util.Scanner;

public class SwitchTopic {
    public static void main(String[] args) {

        System.out.println(" Enter 1 to 4 : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("Wake up");

        }

    }
}
