package Algorithms.Sorting.bucketsort;

public class Main {

    public static void main(String[] args) {
        int[] arr={12,8,10,7,3,14,6};
        Bucket b=new Bucket(arr);
        b.bucketSort();
    }
}
