package assaingments.conditonalstatement;

public class LargestValue {
    public static void main(String[] args) {
        //ternary operator
        //? variable = condition ? statement 1 : statement 2

        //Check if a student will pass or fail
        //marks  >= 33 : pass
        // marks < 33 : fail


        //print the largest
        // A= 1, B = 3, C = 6

        int A = 6;
        int B = 3;
        int C = 7;

        if (A > B && A > C) {
            System.out.println("largest " + A);
        } else if (B > A && B > C) {
            System.out.println("largest " + B);
        } else
            System.out.println("largest " + C);
    }
}
