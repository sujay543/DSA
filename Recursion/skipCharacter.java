package Recursion;

public class skipCharacter {
    public static void main(String[] args) {
        String s = "abcba";
        skipCharacter(s, " ");
    }

    static void skipCharacter(String s, String n) {

        if (s.isEmpty()) {
            System.out.println(n);
            return;
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            skipCharacter(s.substring(1), n);
        } else {
            skipCharacter(s.substring(1), n + ch);
        }
    }
}
