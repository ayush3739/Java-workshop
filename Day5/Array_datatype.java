package Day5;
import java.util.*;
public class Array_datatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];

        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }

        for (int i=0;i<5;i++){
            System.out.println("element "+i+" = "+arr[i]);
        }


    }
}
