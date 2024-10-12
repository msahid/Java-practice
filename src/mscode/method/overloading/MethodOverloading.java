package mscode.method.overloading;

public class MethodOverloading {
    public static void display(int a){
        System.out.println("Arguments: "+ a);

    }
    public static void display(int a, int b){
        System.out.println("Arguments "+ a + " and "+ b);
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(14);
        display(20, 25);
        display("Hello");
    }
}
