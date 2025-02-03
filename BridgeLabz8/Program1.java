import java.util.Scanner;

class Program1 {
    public double CalculateINTREST(double Princple, double rate, double time) {
		
        return (Princple * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Princple: ");
        double Princple = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        Program1 calculator = new Program1();
        double simpleInterest = calculator.CalculateINTREST(Princple, rate, time);

        System.out.printf("The Simple Interest is %.2f for Princple %.2f, Rate of Interest %.2f, and Time %.2f%n", simpleInterest, Princple, rate, time);
    }
}
