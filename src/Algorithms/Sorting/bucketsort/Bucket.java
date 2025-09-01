package Algorithms.Sorting.bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bucket {

    int[] arr;

    public Bucket(int[] arr) {
        this.arr = arr;
    }

    //print buckets
    public void printBucket(List<Integer>[] buckets /*Array of lists of type integer*/) {
        // More safe approach will be List<List<Integer>>
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("BUCKET " + i + " :");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.println(buckets[i].get(j) + " ");
            }
        }
    }

    //Bucket Sorting
    public void bucketSort() {
        //finding total buckets needed
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));

        //finding max value in an array
        int maxVal = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > maxVal)
                maxVal = v;
        }

        //creating buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        //int[]              var= new Int[size];

        //initializing each index of array with an ArrayList
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        //finding which bucket each element in the array belong
        //to and adding elements to thet bucket
        for (int ele : arr) {
            int bucketNumber = (int) Math.ceil((float) ele * numberOfBuckets / (float) maxVal);//type conversion to float to get correct bucket number
            buckets[bucketNumber - 1].add(ele);
        }

        //Printing the buckets
        System.out.println("Printing The Buckets Before Sorting:--");
        printBucket(buckets);

        for (List list : buckets) {
            Collections.sort(list);
        }

        //Printing the buckets
        System.out.println("Printing The Buckets After Sorting:--");
        printBucket(buckets);

        //inserting sorted values back to arr
        int index = 0;
        for (List<Integer> l : buckets) {
            for (int i : l) {
                arr[index]=i;
                index++;
            }
        }

        //Printing the Sorted Array
        System.out.println("Printing the Sorted Array:--");
        System.out.println("ARRAY :: "+ Arrays.toString(arr));
    }

}
