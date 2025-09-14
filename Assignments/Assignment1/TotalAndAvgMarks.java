package Assignments.Assignment1;

// class DefaultValues {
    
//     byte b;
//     short s;
//     int i;
//     long l;
//     float f;
//     double d;
//     char c;
//     boolean bool;

//     public static void main(String[] args) {
//         DefaultValues obj = new DefaultValues();
        
//         System.out.println("Default values of primitive data types:");
//         System.out.println("byte: " + obj.b);
//         System.out.println("short: " + obj.s);
//         System.out.println("int: " + obj.i);
//         System.out.println("long: " + obj.l);
//         System.out.println("float: " + obj.f);
//         System.out.println("double: " + obj.d);
//         System.out.println("char: '" + obj.c + "'");
//         System.out.println("boolean: " + obj.bool);
//     }
// }


class TotalAndAvgMarks {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java TotalAndAvgMarks <Name> <Marks1> <Marks2> <Marks3>");
            return;
        }

        String name = args[0];
        int marks1 = Integer.parseInt(args[1]);
        int marks2 = Integer.parseInt(args[2]);
        int marks3 = Integer.parseInt(args[3]);

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
