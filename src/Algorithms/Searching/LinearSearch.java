package Algorithms.Searching;

public class LinearSearch {

    public static int lSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("ELEMENT " + key + " FOUND AT INDEX " + i);
                return i;
            }
        }
        System.out.println("ELEMENT " + key + " NOT FOUND");
        return -1;
    }
}
