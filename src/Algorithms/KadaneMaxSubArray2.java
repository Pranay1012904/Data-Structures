package Algorithms;

public class KadaneMaxSubArray2 {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }

    public static void maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("MAX :: "+max);
    }


}
