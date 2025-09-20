package Day7;

//Step-1: Create a user-defined exception class
class InvalidAgeException extends Exception{
    //Constructor with custom message
    public InvalidAgeException(String msg){
        super(msg);
    }
}




public class UserdefinedException {

    static void checkAge(int age) throws InvalidAgeException{
        // Method that check eligibility
        if (age<18){
            //throw custom exception
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        }
        else{
            System.out.println("Your are eligible ");
        }
    }
    public static void main(String[] args) {
        try{
            int userAge=16;
            checkAge(userAge);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }

        System.out.println("Program continues after exception");
    }
}
