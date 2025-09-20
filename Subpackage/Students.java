package Subpackage;
import Mypackage.message;
import Examplesub.*;

public class Students extends message{
    
    @Override
    public void display(){
        System.out.println("Hello Students");

    }

    public void displayall(){
        calc c=new calc();
        System.out.println("Addition: "+c.add(12, 8));
        System.out.println("Subtraction: "+c.sub(10, 3));
        System.out.println("Multiplication: "+c.mul(5, 4));
        System.out.println("Divide: "+c.divide(100, 25));
    }

    
}
