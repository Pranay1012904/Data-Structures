package Bosscoder.rev_1.strings;

public class ToLowerCase {


    public static void toLowerCase(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(String.valueOf(Character.toLowerCase(c[i])));
        }
        System.out.println(sb);
    }
}
