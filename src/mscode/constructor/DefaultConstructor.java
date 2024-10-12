package mscode.constructor;

public class DefaultConstructor {
    int a;
    boolean b;

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        System.out.println("default Value:");
        System.out.println("a = "+ defaultConstructor.a);
        System.out.println("b = "+ defaultConstructor.b);
    }
}
