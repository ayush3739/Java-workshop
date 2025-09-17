package Day5;

interface Greeting {
    void sayHello(); // abstract method

    default void sayGoodbye() { // default method
        System.out.println("Goodbye!");
    }

    static void printWelcome() { // static method
        System.out.println("Welcome!");
    }
}



public class LambdaNoparameter {
    
    public static void main(String[] args) {
        System.out.println("");
        Greeting greeting=() ->{
            System.out.println("Hello!! welcome to lambda expression");
        };
        
        greeting.sayHello();
        greeting.sayGoodbye();
        Greeting.printWelcome();
    }
}
