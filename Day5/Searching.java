package Day5;

import java.util.Scanner;

class Search {
    int[] a = new int[10];
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter 10 elements");
        for (int i = 0; i < 10; i++)
            a[i] = sc.nextInt();
    }

    public int linearsearch(int item) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item)
                return (i + 1);
        }
        return -1;
    }

    public int binarysearch(int item) {
        int[] sorted = a.clone(); // Clone to avoid sorting the original array
        java.util.Arrays.sort(sorted); // Sort the cloned array
        int f = 0, l = sorted.length - 1;
        int mid;
        while (f <= l) {
            mid = (f + l) / 2;
            if (sorted[mid] == item)
                return (mid + 1);
            else if (sorted[mid] < item)
                f = mid + 1;
            else
                l = mid - 1;
        }
        return -1;
    }
}

public class Searching {
    public static void main(String[] args) {
        Search obj = new Search();
        obj.input();
        int pos = obj.linearsearch(15);
        if (pos == -1)
            System.out.println("Not Found");
        else
            System.out.println("Element found at position " + pos);
        pos = obj.binarysearch(15);
        if (pos == -1)
            System.out.println("Not Found");
        else
            System.out.println("Element found at position " + pos);
    }
}
