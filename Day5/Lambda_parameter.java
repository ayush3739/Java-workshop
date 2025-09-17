package Day5;

interface Square {
    int square(int x);
}

interface Add {
    int add(int x, int y);
}

interface Multiply {
    int multiply(int x, int y);
}


public class Lambda_parameter {
    public static void main(String[] args) {
        
        System.out.println("");
    

        Square square = (n) -> n * n;
        Add add = (a, b) -> a + b;
        Multiply mul = (a, b) -> a * b;

        System.out.println("Square of 5 is: " + square.square(5));
        System.out.println("Square of 9 is: " + square.square(9));
        
        System.out.println("Sum of 9 and 1 is: " + add.add(9, 1));
        
        System.out.println("Product of 9 and 10 is: " + mul.multiply(9, 10));
        
        System.out.println("Sqaure of 5 is: "+add.add(9,1));
        
        System.out.println("Sqaure of 5 is: "+mul.multiply(9,10));
        
    }
}
