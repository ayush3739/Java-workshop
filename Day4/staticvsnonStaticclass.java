package Day4;

class Car{

    private String brand;

    //constructor
    Car(String brand){
        this.brand=brand;

    }

    //Nested static class
    static class Engine {
        void start(){
            System.out.println("Engine is Starting.....");
        }  
        
    }

    class Dashboard{
        void showbrand(){
            System.out.println("Car brand: "+brand);
        }
    }


}

public class staticvsnonStaticclass {
    public static void main(String[] args) {

        //using static nested class (no need of Car object)
        Car.Engine engine=new Car.Engine();
        engine.start();

        // Using non-static inner class (needs Car object)
        Car mycar=new Car("Tesla");
        Car.Dashboard dashboard=mycar.new Dashboard();

        dashboard.showbrand();
        
    }
}
