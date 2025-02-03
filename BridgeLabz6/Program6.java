import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double total = 0.0;

        // Input player heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            total += heights[i];
        }

        // Calculate mean height
        double mean = total / heights.length;
        System.out.println("The mean height of the football team is: " + mean);

        input.close();
    }
}
