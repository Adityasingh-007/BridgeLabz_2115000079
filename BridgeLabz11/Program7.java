import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled.append(Character.toLowerCase(ch));
            else toggled.append(Character.toUpperCase(ch));
        }

        System.out.println("Toggled Case: " + toggled);
    }
}
