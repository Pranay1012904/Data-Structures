package LeetCode;

import java.util.Arrays;

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        stringNumber(-1221);
    }

    public static void stringNumber(int x){
        String sX= String.valueOf(x);
        StringBuilder sb=new StringBuilder();
        for(int i= sX.length()-1;i>=0;i--){
            sb.append(sX.charAt(i));
        }
        if(sX.equalsIgnoreCase(String.valueOf(sb))){
            System.out.println("true");
        }
    }

}
