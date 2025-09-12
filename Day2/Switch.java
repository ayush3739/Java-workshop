package Day2;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=0;

        switch (a) {
            case 1:d=c+b;break;
            case 2:d=b-c;break;
            case 3:d=b*c;break;
            case 4:d=b/c;break;
            default:d=0;
        }
        System.out.println("Result="+d);
    }
}
