package Bosscoder.rev_1.strings;

import java.util.Arrays;

/*Check whether two Strings are anagram of each other.
Note : An anagram of a string is another string that contains the same characters,
only the order of characters can be different.
 */
public class Anagram2 {

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1,c2));
    }


}
