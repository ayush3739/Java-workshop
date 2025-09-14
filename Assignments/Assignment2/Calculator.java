package Assignments.Assignment2;
class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

   
    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 20);
        int difference = calc.subtract(50, 30);

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
