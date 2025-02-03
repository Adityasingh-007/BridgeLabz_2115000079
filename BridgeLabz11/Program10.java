import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char remove = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Modified String: " + str.replace(Character.toString(remove), ""));
    }
}
