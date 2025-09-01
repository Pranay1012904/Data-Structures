package Algorithms.stringOps;

public class Palindrome {

    public static void main(String[] args) {
        palindrome_1();
        int resp = twoPointer();
        System.out.println(resp);
    }

    private static void palindrome_1() {
        String s = "abbca";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println(s2.equals(s));
    }

    private static int twoPointer() {
        String s = "abba";
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }


}
