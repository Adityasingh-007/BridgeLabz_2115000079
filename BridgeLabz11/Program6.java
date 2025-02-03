import java.util.Scanner;

public class Program6 {
    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a substring to search: ");
        String sub = scanner.nextLine();
        scanner.close();

        System.out.println("Occurrences: " + countOccurrences(str, sub));
    }
}
