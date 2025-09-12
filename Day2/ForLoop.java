package Day2;
import java.util.Scanner;

public class ForLoop {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact; // return result
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ForLoop fc = new ForLoop();

        int a = sc.nextInt();
        int result = fc.factorial(a);

        System.out.println("Factorial of " + a + " = " + result);
    }
}
