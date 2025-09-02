package Bosscoder.rev_1.strings;
/*Check if given String is Pangram or not
Note : A pangram is a sentence containing every letter in the English Alphabet.*/

import java.util.HashSet;
import java.util.Set;

public class Pangram2 {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        checkPangram(s);

    }

    public static void checkPangram(String sL) {
        String s=sL.toLowerCase().replaceAll(" ","");
        Set<String> set = new HashSet<>();
        String[] arr = s.split("");
        System.out.println(s);
        for (int i = 0; i < arr.length; i++) {
            if(Integer.valueOf(arr[i].charAt(0))>=97 && Integer.valueOf(arr[i].charAt(0))<=122){
                set.add(arr[i]);
            }
        }
        System.out.println("LENGTH:"+set.size());
    }
}
