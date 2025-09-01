package Bosscoder.rev_1.strings;

import java.util.Arrays;

public class Anagram {
    static boolean check(String str1, String str2) {
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
