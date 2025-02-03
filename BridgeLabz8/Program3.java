import java.util.Scanner;

class Program3 {
    // Method to calculate the maximum number of handshakes
    public int calculateHandshakes(int NUM) {
        return (NUM * (NUM - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students as input
        System.out.print("Enter the number of students: ");
        int NUM = scanner.nextInt();

        // Validate input (number of students must be non-negative)
        if (NUM < 0) {
            System.out.println("The number of students cannot be negative. Please enter a valid number.");
            return;
        }

        // Create an object of Program3 and compute the result
        Program3 CAL = new Program3();
        int totalHandshakes = CAL.calculateHandshakes(NUM);

        // Display the result
        System.out.println("The maximum number of handshakes among " + NUM + " students is: " + totalHandshakes);
    }
}
