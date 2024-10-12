package mscode.method.basic;

public class Example1 {
    public int adNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1= 25;
        int num2 = 15;

        Example1 m1 = new Example1();

        int result = m1.adNumbers(num1,num2);
        System.out.println(" Sum is: "+ result);
    }

}
