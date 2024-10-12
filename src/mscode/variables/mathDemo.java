package mscode.variables;

public class mathDemo {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result1 =  (int) Math.ceil(1.1F);
        System.out.println(result1);

        int result2 =  (int) Math.floor(1.1F);
        System.out.println(result2);

        int result3 =  Math.max(569, 894);
        System.out.println(result3);

        double result4 =  Math.round(Math.random()*95);
        System.out.println(result4);
    }
}
