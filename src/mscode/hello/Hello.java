package mscode.hello;

import mscode.hellos.Hellos;

public class Hello {
    //Access modifier
    //class, methods, variable, constructor
    //default,  public, private, protected

    public String snowMan = "Snow Winter";
    private void snow(){
        System.out.println("Private method accessed");
    }

    public static void main(String[] args) {
        var h = new Hello();
        System.out.println(h.snowMan);
    }


}
