import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;

        char maxChar = ' ';
        int maxFreq = 0;
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }
        System.out.println("Most Frequent Character: " + maxChar);
    }
}
