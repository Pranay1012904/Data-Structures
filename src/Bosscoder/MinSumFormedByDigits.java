package Bosscoder;

import java.util.Arrays;

public class MinSumFormedByDigits {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{6, 8, 4, 5, 2, 3}));

    }
    static int sum(int[]  input){
        Arrays.sort(input);
        String[] arr=new String[input.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=String.valueOf(input[i]);
        }
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sb1.append(arr[i]);
            }else{
                sb2.append(arr[i]);
            }
        }
        return Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString());
    }
}
