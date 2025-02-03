import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] words = scanner.nextLine().split("\\s+");
        scanner.close();

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) longestWord = word;
        }

        System.out.println("Longest Word: " + longestWord);
    }
}
