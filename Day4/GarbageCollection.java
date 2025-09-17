package Day4;


public class GarbageCollection {

    String name;

    GarbageCollection(String name){
        this.name = name;
    }

    @Override
    protected void finalize()throws Throwable{
        System.out.println("Garbage collected for object : "+name);
    }

    public static void main(String[] args) {
        GarbageCollection obj1=new GarbageCollection("Object1");
        GarbageCollection obj2=new GarbageCollection("Object2");
        obj1=null;
        obj2=null;  
        
        System.out.println("Requesting Garbage collection...");
        System.gc();

        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            // Handle exception if needed
        }
    }
}
