package Algorithms.binarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={23,12,8,34,9,2,67,0};
        Arrays.sort(arr);
        System.out.println("ARRAY :: "+Arrays.toString(arr));
        BSearch_1 b1=new BSearch_1();
       b1.bsearch_1(arr, 0, arr.length-1, 7 );
    }
}
