package Assignments.Assignement4;

import java.util.*;

class Garments{
    private String Gcode;
    private String Gtype;
    private int Gsize;
    private String Gfabric;
    private float Gprice;
    
    Garments(){
        Gcode="Not allowed";
        Gtype="Not allowed";
        Gfabric="Not allowed";
        Gsize=0;
        Gprice=0;
    }
    
    private void assign(){
        if (Gfabric.equalsIgnoreCase("COTTON")){
            if (Gtype.equalsIgnoreCase("Trouser")) {
                Gprice=1300;
            }
            else if (Gtype.equalsIgnoreCase("Shirt")){
                Gprice=1100;
            }
        }
        else{
            if (Gtype.equalsIgnoreCase("Trouser")) {
                Gprice=1300*0.9f;
            }
            else if (Gtype.equalsIgnoreCase("Shirt")){
                Gprice=1100*0.9f;
            }    
        }
    }

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Garment Code: ");
        Gcode = sc.nextLine();

        System.out.print("Enter Garment Type (Trouser/Shirt): ");
        Gtype = sc.nextLine();

        System.out.print("Enter Garment Size: ");
        Gsize = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Garment Fabric (Cotton/Silk/Other): ");
        Gfabric = sc.nextLine();

        assign();
    }

    public void display(){
        System.out.println("\nGarment Details:");
        System.out.println("Code: " + Gcode);
        System.out.println("Type: " + Gtype);
        System.out.println("Size: " + Gsize);
        System.out.println("Fabric: " + Gfabric);
        System.out.println("Price: " + Gprice);
    }


}




public class Clothing_store {
    public static void main(String[] args) {
        Garments g=new Garments();
        g.Input();
        g.display();
    }
}
