package Day4;

abstract class Vehicle{
    abstract void start();

    void fuel(){
        System.out.println("This vehicle needs fuel to run.");
    }
}

class Truck extends  Vehicle{
    @Override
    void start(){
        System.out.println("Truck starts with a key");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike Starts with a kick or button.");
    }

    @Override
    void fuel(){
        System.out.println("This is the bike's  fuel");
    }
}

public class Abstractclass {
    
    public static void main(String[] args) {
        Vehicle v1=new Truck(); // using reference of abstract class
        
        v1.start(); //Calls Truck's start
        v1.fuel(); // Calls Vehicle's fuel

        Vehicle v2=new Bike();
        v2.start();// Call bike's start
        v2.fuel();// call bike's fuel

        v1.fuel();
        
        
    }
}
