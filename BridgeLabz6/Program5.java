import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();
        int[][] results = new int[4][10];

        // Calculate multiplication tables from 6 to 9
        for (int i = 6; i <= 9; i++) {
            for (int j = 0; j < 10; j++) {
                results[i - 6][j] = i * (j + 1);
            }
        }

        // Display results
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table of " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " * " + (j + 1) + " = " + results[i - 6][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
