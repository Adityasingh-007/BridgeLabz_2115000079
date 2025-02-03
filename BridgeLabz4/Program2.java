import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
    }
}
