package Algorithms.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSearch_2 {

    public static void main(String[] args) {
        int[] arr = {56, 12, 89, 10, 9, 3, 67};
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Arrays.sort(arr);//NlogN->merge sort
        System.out.println(bSearch(arr, k, 0, arr.length - 1));
    }

    public static int bSearch(int[] arr, int k, int l, int r) {
        int mid = l + r / 2;
        while (l <= r) {
            if (arr[mid] == k){
                return 0;
            }else if(arr[mid]<k){
                l=mid+1;
                bSearch(arr, k, l, r);
            }else if(arr[mid]>k){
                r=mid-1;
                bSearch( arr, k, l, r);
            }
        }
        return -1;
    }


}
