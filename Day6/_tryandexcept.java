package Day6;

public class _tryandexcept {
    public static void main(String[] args) {
        int a=10;
        int b=10;

        try{
        int result=a/b;
        System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed! ");
            System.out.println("Exception Message: "+e.getMessage());
        }

        finally{
            System.out.println("Finally block");
        }

        System.out.println("After Try");
    }
    
}
