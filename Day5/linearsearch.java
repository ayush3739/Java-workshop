package Day5;

class Search{

    static int search_Array(int[] arr,int n){
        if (arr.length==0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}



public class linearsearch {
    public static void main(String[] args) {
        System.out.println("");


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 21, 25, 30, 35, 40, 45, 50};
        int target=15;
        System.out.println("the "+target+" is at index: "+Search.search_Array(arr, target));
    }
}
