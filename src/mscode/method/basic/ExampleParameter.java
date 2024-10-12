package mscode.method.basic;

public class ExampleParameter {
    public void display1(){
        System.out.println("Method with out any parameter.");
    }

    public void display2(int a){
        System.out.println("Method with a single parameter "+ a);
    }

    public static void main(String[] args) {
        ExampleParameter exampleParameter = new ExampleParameter();
        exampleParameter.display1();
        exampleParameter.display2(20);


    }
}
