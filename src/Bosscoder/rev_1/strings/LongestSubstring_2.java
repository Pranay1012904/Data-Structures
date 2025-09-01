package Bosscoder.rev_1.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_2 {

    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        String s ="dvdf"; //"pwwkew";//"dvdf";//"abcb"; //"abcabcbb";//"abcabcbb";
        Set<Character> set=new HashSet<>();
        int l=0,r=0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max=Math.max(max,(r-l)+1);
                r++;
            }else{
                set.clear();
                l++;
                r=l;
            }
        }
        System.out.println(max);
    }
}
