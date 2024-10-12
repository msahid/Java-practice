package mscode.constructor;

public class ConstructorExample1 {

    private String name;

    ConstructorExample1(){
        System.out.println("Constructor Called: ");
        name = "Sahid";
    }
 /*   // public constructor
    public ConstructorExample1(){
        System.out.println("Constructor Called: ");
    }*/


    public static void main(String[] args) {
        ConstructorExample1 constructorExample1 = new ConstructorExample1();
        System.out.println(" The name is "+ constructorExample1.name);

    }
}
