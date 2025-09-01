package Bosscoder.rev_1.strings;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static boolean checkPangram(String s) {
        String nS = s.replaceAll(" ", "").toUpperCase();
        System.out.println(nS);
        Set hS = new HashSet();
        for (int i = 0; i < nS.length(); i++) {
            if(Integer.valueOf(nS.charAt(i))>=65 && Integer.valueOf(nS.charAt(i))<=90){
                hS.add(nS.charAt(i));
            }
        }
        System.out.println(hS.size());
        if(hS.size()==26){
            return true;
        }
        return false;
    }
}
