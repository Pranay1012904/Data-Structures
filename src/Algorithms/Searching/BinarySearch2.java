package Algorithms.Searching;

public class BinarySearch2 {

    public static int binarySearch(int[] arr, int li, int hi, int k) {
        int mid;
        while (li <= hi) {
            mid = li + hi / 2;

            if (arr[mid] == k) {
                System.out.println("KEY :: " + k + " FOUND AT INDEX " + mid);
                return mid;
            } else if (arr[mid] < k) {
                li = mid + 1;
                binarySearch(arr, li, hi, k);
            } else if(arr[mid] > k){
                hi = mid - 1;
                binarySearch(arr, li, hi, k);
            }

        }
        System.out.println(String.format("ELEMENT %d NOT FOUND!",k));
        return 0;
    }
}
