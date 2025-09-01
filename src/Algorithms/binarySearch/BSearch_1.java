package Algorithms.binarySearch;

import java.util.Queue;

//if exists return 0 else return -1
public class BSearch_1 {

    public int bsearch_1(int[] arr, int li, int ri, int k) {

        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (arr[mid] == k) {
                System.out.println("Element " + arr[mid] + " found at index " + mid);
                return mid;
            } else if (arr[mid] < k) {
                li = mid + 1;
                bsearch_1(arr, li, ri, k);
            } else {
                ri = mid - 1;
                bsearch_1(arr, li, ri, k);
            }
            return 0;
        }
        System.out.println("Not Found!");
        return 1;


    }
}
