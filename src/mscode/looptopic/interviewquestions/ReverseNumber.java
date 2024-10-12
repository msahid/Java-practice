package mscode.looptopic.interviewquestions;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = 1234, reversed = 0;
        System.out.println("Original Number: " + number);

        // run loop until number becomes 0
        while(number != 0) {

            // get last lastDigit from number
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;

            // remove the last lastDigit from number
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
