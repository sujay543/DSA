package Recursion;

public class removeSubString {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        System.out.println(removeOccurrences(s, "abc"));
    }

    static String removeOccurrences(String s, String part) {
        if (s.isEmpty()) {
            return " ";
        }
        if (s.startsWith(part)) {
            return removeOccurrences(s.substring(part.length()), part);
        } else {
            return s.charAt(0) + removeOccurrences(s.substring(1), part);
        }
    }
}
