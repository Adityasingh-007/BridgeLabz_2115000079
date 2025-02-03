import java.util.Scanner;

class Program5 {
    public int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        Program5 check = new Program5();
        int result = check.checkNumberSign(number);

        if (result == 1) System.out.println("The number is positive.");
        else if (result == -1) System.out.println("The number is negative.");
        else System.out.println("The number is zero.");
    }
}
