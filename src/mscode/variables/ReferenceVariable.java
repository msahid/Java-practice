package mscode.variables;

import java.awt.*;

public class ReferenceVariable {
    public static void main(String[] args) {
       //Variable
        int age = 21;

        //Reference
        Point pointA = new Point(17,15);
        System.out.println("pointA = " + pointA);

        pointA.move(10,25);
        System.out.println("pointA = " + pointA);
    }
}
