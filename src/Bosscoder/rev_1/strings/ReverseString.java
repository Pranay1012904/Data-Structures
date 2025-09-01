package Bosscoder.rev_1.strings;

public class ReverseString {


    public static void rev_String(String s) {
        /*StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);*/
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sArr.length - 1; i >= 0; i--) {
            sb.append(sArr[i]);
            if (i != 0)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}
