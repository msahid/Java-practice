package mscode.conditionalstatement.ifelse;

public class IfElseDemo {
    public static void main(String[] args) {
        String userId="mehedi" ;
        String password="123";

        if(userId.equals("mehedi") &&(password.equals("123"))){
            System.out.println("Welcome to Facebook ");
        }else
        System.out.println("Wrong userId or Password");
        System.out.println("userId = " + userId);//soutv
    }
}
