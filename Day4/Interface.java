package Day4;

interface MountainParts{
    //constant
    String TERRAIN="off-road";

    //Abstract methods
    String getsuspension();
    void setSuspension(String newValue);

    String getType();
    void setType(String newValue);
}

class MountainBike implements MountainParts{
    //Instances Variables
    private String suspension;
    private String type;

    MountainBike(String suspension,String type){
        this.suspension=suspension;
        this.type=type;
    }

    @Override
    public String getsuspension(){
        return suspension;
    }

    @Override
    public void setSuspension(String newValue){
        this.suspension=newValue;
    }

    @Override
    public String getType(){
        return type;

    }

    @Override
    public void setType(String newValue){
        this.type=newValue;
    }

    void display(){
        System.out.println("Terrain: "+TERRAIN);
        System.out.println("Suspension: "+suspension);
        System.out.println("Type: "+type);
    }

}

public class Interface {
    
    public static void main(String[] args) {
        MountainBike bike = new MountainBike("asa","good");
        bike.getsuspension();
        bike.getType();
        bike.setSuspension("Dual");
        bike.setType("Trail");
        bike.display();

        
    }
}
