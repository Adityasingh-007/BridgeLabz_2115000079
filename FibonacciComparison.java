public class FibonacciComparison {
public static void main(String[] args) {
int[] testCases = {10, 30, 50};
for (int n : testCases) {
long start, end;
start = System.nanoTime();
fibonacciRecursive(n);
end = System.nanoTime();
System.out.println("Recursive Fibonacci (N=" + n + "): " + (end - start) / 1e6 + " ms");
start = System.nanoTime();
fibonacciIterative(n);
end = System.nanoTime();
System.out.println("Iterative Fibonacci (N=" + n + "): " + (end - start) / 1e6 + " ms");
}
}
public static int fibonacciRecursive(int n) {
if (n <= 1) return n;
return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}
public static int fibonacciIterative(int n) {
if (n <= 1) return n;
int a = 0, b = 1, sum;
for (int i = 2; i <= n; i++) {
sum = a + b;
a = b;
b = sum;
}
return b;
}
}
