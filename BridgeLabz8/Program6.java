import java.util.Scanner;

class Program6 {
    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        Program6 checker = new Program6();
        boolean result = checker.isSpringSeason(month, day);

        if (result) System.out.println("It's Spring Season.");
        else System.out.println("Not Spring Season.");
    }
}
