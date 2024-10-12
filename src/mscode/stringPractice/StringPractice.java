package mscode.stringpractice;

public class StringPractice {
    public static void main(String[] args) {
        String txt = "Hello World";
        String txt2 =" welcome to Java Programing";
        System.out.println(txt.concat(txt2));
        String upperCase = txt.toUpperCase();
        System.out.println(upperCase);
        System.out.println(txt2.contains("t"));
        String lowerCase = txt.toLowerCase();
        System.out.println(lowerCase);


        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate"));
        System.out.println(txt1.length());

    }
}
