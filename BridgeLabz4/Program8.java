import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ages and heights of Amar, Akbar, and Anthony
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();

        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();

        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();

        // Find the youngest friend
        String youngestFriend;
        int youngestAge;

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngestFriend = "Amar";
            youngestAge = ageAmar;
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngestFriend = "Akbar";
            youngestAge = ageAkbar;
        } else {
            youngestFriend = "Anthony";
            youngestAge = ageAnthony;
        }

        // Find the tallest friend
        String tallestFriend;
        double tallestHeight;

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallestFriend = "Amar";
            tallestHeight = heightAmar;
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallestFriend = "Akbar";
            tallestHeight = heightAkbar;
        } else {
            tallestFriend = "Anthony";
            tallestHeight = heightAnthony;
        }

        // Output results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");

        scanner.close();
    }
}
