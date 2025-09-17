package Day5;


public class Countoftwonum {

    public boolean CompareCountof(int[] arr,int arg1,int arg2){
        int count1=0;
        int count2=0;

        for (int num:arr){
            if (num==arg1){
                count1++;
            }
            if (num==arg2){
                count2++;
            }

        }
        return count1 > count2;
    }

    public static void main(String[] args) {
        Countoftwonum obj=new Countoftwonum();

        int[] arr={1,2,3,4,5,4,4,6,1,5,1,1,2,1,1,1,2};

        System.out.println("Is count of 1>2: "+obj.CompareCountof(arr,1,2));
        System.out.println("Is count of 2>3: "+obj.CompareCountof(arr, 3, 4));

    }
}
