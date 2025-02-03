import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner Inputt = new Scanner(System.in);
        int Cout =Inputt.nextInt();

        while (Cout >= 1) {
            System.out.println(Cout);
            Cout--;
        }
        System.out.println("Liftoff!");
    }
}
