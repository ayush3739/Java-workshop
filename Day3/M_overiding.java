package Day3;

class base{
    public void show(){
        System.out.println("Base class method");
    }
}

class Derived extends base{
    public void show(){
        super.show();
        System.out.println("Derived class method");
    }
}

public class M_overiding {
    public static void main(String[] args) {
        Derived d=new Derived();
        d.show();
        
        
    }
}
