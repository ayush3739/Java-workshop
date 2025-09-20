package Assignments.Assignment4;
class OuterClassWithInterface {
    
    interface NestedInterface {
        void nestedMethod();
    }
}

class Implementation implements OuterClassWithInterface.NestedInterface {
    public void nestedMethod() {
        System.out.println("Inside nested interface method (inside a class).");
    }   
}

public class Nested_inter_class {
    public static void main(String[] args) {
        Implementation obj = new Implementation();
        obj.nestedMethod();
        
    }
}
