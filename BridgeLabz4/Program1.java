import java.util.Scanner;

public class Program1 {
	
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int year = Inputt.nextInt();

        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a Leap Year.");
                } else {
                    System.out.println("The year " + year + " is not a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
    }
}
