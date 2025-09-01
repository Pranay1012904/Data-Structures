package Bosscoder.rev_1.strings;

import java.util.*;

public class LongestSubString {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        String s ="dvdf";//"abcb"; //"abcabcbb";//"pwwkew";//"abcabcbb";

        Set<Character> set = new HashSet<>();
        int l = 0, r = 0;
        int max = 0;
            while (r < s.length()) {
                if (!set.contains(s.charAt(r))) {
                    set.add(s.charAt(r));
                    max = Math.max(max, (r - l) + 1);
                    r++;
                } else {
                    set.clear();
                    l++;
                    r=l;
                }
            }

        System.out.println(max);
    }
}
