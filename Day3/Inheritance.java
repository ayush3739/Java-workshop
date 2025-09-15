package Day3;
import java.util.*;

class Student{
    
    String name;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Name: "+name);
    }
}

class Marks extends Student{
    int marks;

    public void inputmarks(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Student Marks: ");
        int marks=sc.nextInt();

        System.out.println("Marks: "+marks);

}}

class Sports extends Marks{
    String sport;
    public Sports(String k){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sports:");

        sport=k;
        System.out.println("Sports: "+sport);

    }
}

public class Inheritance {

     public static void main(String[] args) {
        Marks m=new Marks();
        m.input();
        Sports s=new Sports("ayush");

        
        s.inputmarks();
        
                   
     }
}