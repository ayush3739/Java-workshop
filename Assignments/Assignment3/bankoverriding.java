package Assignments.Assignment3;

class bank{
    public double getrateOfinterest(){
        return 0.0;
    }
}
class SBI extends bank{
    public double getrateOfinterest(){
        return 5.6;
    }
}

class AXIS extends bank{
    public double getrateOfinterest(){
        return 3.4;
    }
}

class ICICI extends bank{
    public double getrateOfinterest(){
        return 7.8;
    }
}

public class bankoverriding {
    
    public static void main(String[] args) {
        SBI s=new SBI();
        AXIS a=new AXIS();
        ICICI i=new ICICI();

        System.out.println("SBI Rate of Interest: " + s.getrateOfinterest() + "%");
        System.out.println("ICICI Rate of Interest: " + a.getrateOfinterest() + "%");
        System.out.println("AXIS Rate of Interest: " + i.getrateOfinterest() + "%");
        
    }
}
