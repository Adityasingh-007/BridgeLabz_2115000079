import java.util.Scanner;

public class Program4 {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("String after removing duplicates: " + removeDuplicates(str));
    }
}
