package Day2;
import java.util.Scanner;

public class FibonacciDoWhile {
    public void fibonacciSeries(int n) {
        int a = 0, b = 1, i = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        } while (i <= n);

        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciDoWhile fb = new FibonacciDoWhile();
sc.close();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fb.fibonacciSeries(n);
    }
}
