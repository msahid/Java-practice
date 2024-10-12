package mscode.functionstopic;

public class FunctionsTopic {

    //Function
    //void & return

    //void
    public static void addition() {

        System.out.println("Addition");
    }

    public static String lang() {

        return "Java";

    }

    public static void main(String[] args) {

        System.out.println("void method");
        addition();
        System.out.println("String Return Method ");
        //lang();
        //doest not print until you use and print method after value return
        System.out.println(lang());

    }
}
