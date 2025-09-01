package Algorithms.binarySearch;

import java.util.Arrays;

public class BSearch_3 {

    public static void main(String[] args) {
        int[] arr = {23, 14, 9, 34, 78, 31, 67, 5};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 0, arr.length-1, 99));

    }

    public static int binarySearch(int[] arr, int l, int r, int k) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == k) {
                return 0;
            } else if (arr[mid] < k) {
                l = mid + 1;
                binarySearch(arr, l, r, k);
            } else if (arr[mid] > k) {
                r = mid - 1;
                binarySearch(arr, l, r, k);
            }
        }
        return -1;
    }
}
