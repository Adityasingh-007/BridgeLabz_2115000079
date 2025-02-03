import java.util.Scanner;

public class Program11 {
	
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        double Totall = 0.0;

        while (true) {
            double Numm = Inputt.nextDouble();
            if (Numm <= 0) break;
            Totall += Numm;
        }

        System.out.println("The total sum is " + Totall);
    }
}
