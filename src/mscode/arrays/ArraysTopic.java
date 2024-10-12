package mscode.arrays;

import java.util.Arrays;

public class ArraysTopic {
    public static void main(String[] args) {

        //How to create an Array
        //dataType variables[] = new dataType[Size of Array]
        //Data type in Array should be same
        // int n[5]; error since Arrays are reference type
        // in java memory allocation for reference data type is done during runtime using new operator
        //index starts from 0
        // Array initialization
        //int[] n = {10, 20, 30, 40, 50}

        int[] marks = new int[3];
        marks[0]= 98;
        marks[1]= 87;
        marks[2]= 95;
        //int Array default value 0
        //String Array default value null
        // byte  zero
        // double 0.0
        //boolean false

        System.out.println(Arrays.toString(marks));

       String[] subjects = {"Science", "math", "Social Science"};
    }
}
