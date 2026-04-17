package Recursion;

public class isSubSequence {
    public static void main(String args[]) {
        // s = "abc", t = "ahbgdc"
        String t = "abc";
        String s = "ahbgdc";
        // boolean result = false;
        System.out.println(subSequences(s, "", t));
    }

    static boolean subSequences(String s, String res, String t) {
        if (res.equals(t)) {
            return true;
        }
        if (s.isEmpty()) {
            return false;
        }
        char ch = s.charAt(0);
        return subSequences(s.substring(1), res + ch, t) || subSequences(s.substring(1), res, t);
    }
}
