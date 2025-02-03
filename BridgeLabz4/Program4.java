import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numm = sc.nextInt(); // User input
        boolean isPrime = true; // To store the result


        if (Numm <= 1) {
            isPrime = false; // Prime Numms are greater than 1
        } else {
            for (int i = 2; i <= Math.sqrt(Numm); i++) { 
                if (Numm % i == 0) { // Check divisibility
                    isPrime = false; // If divisible, it's not prime
                    break; // Break the loop as it's not prime
                }
            }
        }

        if (isPrime) {
            System.out.println("The number " + Numm + " is a prime number.");
        } else {
            System.out.println("The number " + Numm + " is not a prime number.");
        }

        sc.close();
    }
}
