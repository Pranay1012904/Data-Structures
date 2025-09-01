package Algorithms.Searching;

public class BinarySearch {

    public static int search(int[] arr, int li, int hi, int key) {
        while (li <= hi) {
            int mid = li + hi / 2;
            if (arr[mid] == key) {
                System.out.println("ELEMENT " + key + " FOUND AT INDEX " + mid);
                return mid;
            } else if (arr[mid] < key) {
                li = mid + 1;
                search(arr, li, hi, key);
            } else {
                hi = mid - 1;
                search(arr, li, hi, key);
            }
            return 0;
        }
        System.out.println("ELEMENT " + key + " NOT FOUND");
        return -1;
    }
}
