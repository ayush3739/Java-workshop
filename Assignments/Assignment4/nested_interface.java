package Assignments.Assignment4;

import Assignments.Assignment4.Outer.inner;

interface Outer{
    void outmethod();

    interface inner{
        void innermethod();
    }
}

class innerface implements Outer.inner{
    public void innermethod(){
        System.out.println("this is inner method");
    }
}

class outerface implements Outer{
    public void outmethod(){
        System.out.println("this is the outer method");
    }
}

public class nested_interface {
    
    public static void main(String[] args) {
        outerface ok=new outerface();
        ok.outmethod();

        innerface in=new innerface();
        in.innermethod();
        
    }
}
