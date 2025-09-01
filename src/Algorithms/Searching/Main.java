package Algorithms.Searching;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 34, 546, 78, 89, 21, 2, 4, 9, 34};
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED ::");
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        //LinearSearch.lSearch(arr, key);
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY::" + Arrays.toString(arr));
        // BinarySearch.search(arr, 0, arr.length - 1, key);
        BinarySearch2.binarySearch(arr, 0, arr.length - 1, key);
    }
}
