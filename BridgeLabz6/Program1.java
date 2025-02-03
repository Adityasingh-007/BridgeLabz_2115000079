import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        // Input student ages
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check for invalid age
            if (ages[i] < 0) {
                System.out.println("Invalid age entered. Please restart the program.");
                System.exit(0);
            }
        }

        // Check voting eligibility
        for (int age : ages) {
            if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
