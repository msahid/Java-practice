package mscode.constructor;

public class ConstructorOverloading {
    String language;

    // constructor with no parameter
    ConstructorOverloading(){
        this.language ="Java";

    }
    // constructor with a single parameter
    ConstructorOverloading(String language){
        this.language = language;
    }
    public void getName(){
        System.out.println("Programing Language: "+ this.language);
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading();

        ConstructorOverloading constructorOverloading1 = new ConstructorOverloading("Python");
        constructorOverloading.getName();
        constructorOverloading1.getName();

    }
}
