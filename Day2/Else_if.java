package Day2;

public class Else_if {
    
    public void checkbalance(double balance){
        if (balance<1000)
            System.out.println("Balance is low");
        
        else if (balance<2000 && balance>1000) 
            System.out.println("Avareage Bal");
        
        else
            System.out.println("Sufficient Balance");
        
    }

    public static void main(String[] args) {
        Else_if bc=new Else_if();

        bc.checkbalance(500);
        bc.checkbalance(1500);
        bc.checkbalance(2000);
    }
}
