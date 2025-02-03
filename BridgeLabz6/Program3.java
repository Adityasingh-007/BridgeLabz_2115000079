import java.util.Scanner;

class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();
        int[] table = new int[10];

        // Calculate multiplication table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
