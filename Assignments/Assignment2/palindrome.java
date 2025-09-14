package Assignments.Assignment2;
import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(int n){
        int original=n;
        int reversed=0;

        
        while (n!=0){
            int s=n%10;
            reversed=reversed*10+s;
            n/=10;
        }
        return original==reversed;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your no.: ");
        int num=sc.nextInt();
        sc.close();


        


        if (ispalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
        
}

