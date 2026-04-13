package Recursion;

public class skipString {
    public static void main(String[] args) {
        String s = "abcba";
        char skipchar = 'a';
        int start = 0;
        StringBuilder sb = new StringBuilder();
        System.out.println(skipCharacter(s, skipchar, start, sb).toString());
    }

    static StringBuilder skipCharacter(String s, char c, int start, StringBuilder sb) {
        if (start == s.length()) {
            return sb;
        }
        if (s.charAt(start) != c) {
            sb.append(s.charAt(start));
        }
        return skipCharacter(s, c, start + 1, sb);
    }
}
