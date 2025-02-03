import java.util.Scanner;

class Program2 {
    public int calHandshake(int num) {
        return (num * (num - 1)) / 2;
    }                               
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        Program2 calculator = new Program2();
        int Handshake = calculator.calHandshake(num);
        System.out.println("The maximum number of Handshake is: " + Handshake);
    }
}
