package Day2;
import java.util.Scanner;

public class FibonacciWhile {
    public void fibonacciSeries(int n) {
        int a = 0, b = 1, i = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        while (i <= n) {
            System.out.print(a + " ");  // print current term
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
        System.out.println();   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciWhile fb = new FibonacciWhile();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fb.fibonacciSeries(n);
    }
}
