import java.util.Scanner;

class Program4 {
    public int CalRounnd(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();
        Program4 run = new Program4();
        int rounds = run.CalRounnd(side1, side2, side3, 5000);
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
