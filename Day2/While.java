package Day2;
import java.util.Scanner;

public class While {
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, i = 2, fib = 0;

        while (i <= n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }

        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        While fc = new While();

        System.out.print("Enter n: ");
        int a = sc.nextInt();

        int fibo = fc.fibonacci(a);

        System.out.println("Fibonacci number at position " + a + " = " + fibo);
    }
}
