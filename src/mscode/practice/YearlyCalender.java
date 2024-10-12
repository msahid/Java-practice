package mscode.practice;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class YearlyCalender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your to look up calender: ");
        int year = sc.nextInt();
        sc.close();

        // Print the calendar for each month in the given year
        for (int month = 1; month <= 12; month++) {
            printMonth(month, year);
        }
    }

    public static void printMonth(int month, int year) {
        // Get the first day of the month
        LocalDate date = LocalDate.of(year, month, 1);

        // Get the day of the week for the first day of the month
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Print the month name and the first day of the week
        System.out.printf("%s %d%n", date.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()), year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print the blank spaces before the first day of the month
        for (int i = 0; i < date.getDayOfWeek().getValue(); i++) {
            System.out.print("   ");
        }

        // Print the dates in the month
        while (date.getMonthValue() == month) {
            System.out.printf(" %2d", date.getDayOfMonth());
            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        // Print a newline character to separate the months
        System.out.println();
    }

}
