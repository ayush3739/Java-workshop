package Day4;
//static variable
//static method can be called without creating an object of the class
// we can't use non-static variable in static method
//
class Student {
    //static variable
    static String schoolname="Modern School";

    //Non-static variable
    String Studentname;

    Student(String name){
        this.Studentname=name;
    }
    //Static method (belongs to class)
    static void showschool(){
        System.out.println("School: "+schoolname);

    }

    //non-static method (belongs to object)
    void showstudent(){
        System.out.println("Student: "+Studentname);
    }
}
public class Static {
    public static void main(String[] args) {
        //call static method directly (no object needed)
        Student.showschool();
        System.out.println(Student.schoolname);
        Student s2=new Student("");
        s2.showstudent();
        
        // change static variable (affects all objects)
        Student.schoolname="Holy public School";
        Student.showschool();

        s2.showschool();


    }

     
}