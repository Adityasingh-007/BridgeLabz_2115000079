import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example array (you can modify this or take input from the user)
        Integer[] numbers = {10, 20, 30, 40, 50};  // Change to null to test NullPointerException
        
        try {
            System.out.print("Enter the index number: ");
            int index = scanner.nextInt();

            // Accessing the array element
            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}