package mscode.constructor;

public class ParameterizedConstructor {
    String languages;

    ParameterizedConstructor(String lang){
        languages = lang;
        System.out.println(languages+ " Programing Language");
    }

    public static void main(String[] args) {
        ParameterizedConstructor pr = new ParameterizedConstructor("Java");
        ParameterizedConstructor pr2 = new ParameterizedConstructor("Python");
        ParameterizedConstructor pr3 = new ParameterizedConstructor("C++");
    }
}
