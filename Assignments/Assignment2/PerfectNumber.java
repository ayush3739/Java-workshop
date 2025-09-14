package Assignments.Assignment2;

import java.util.Scanner;

class PerfectNumber {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your no.: ");
        int num=sc.nextInt();

        sc.close();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}
