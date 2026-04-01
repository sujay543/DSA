package String;

public class reverseWords {
    public static void main(String[] args) {
        String s = "The sky is really blue";
        reversString(s);
    }

    static void reversString(String s) {
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            ns += s.charAt(i);
            if (s.charAt(i) == ' ') {

            }
        }
        System.out.println(ns);
    }
}
