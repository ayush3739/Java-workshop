package Assignments.Assignment3;

class bank{
    public void acc_ammount(int n){
        System.out.println("Account ammount: "+n);
    }
    public void acc_ammount(int m, int k){
        System.out.println("Account ammount: "+m+", Account number: "+k);
    }
}

public class Bankdemo {
    public static void main(String[] args) {
        bank b=new bank();
        b.acc_ammount(1500);
        b.acc_ammount(1300, 1670);
        
    }
}
