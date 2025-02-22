public class ExceptionPropagationDemo {

    // Method that throws an ArithmeticException
    public static void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1(); // Exception propagates to method2()
    }

    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main.");
        }
    }
}