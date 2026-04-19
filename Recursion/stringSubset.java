package Recursion;

import java.util.ArrayList;
import java.util.List;

public class stringSubset {
    public static void main(String args[]) {
        String s = "abc";
        System.out.println(generateSubset(s));
    }

    static List<String> generateSubset(String s) {
        List<String> result = new ArrayList<>();
        return helper(s, "", result);
    }

    static List<String> helper(String s, String ns, List<String> result) {
        if (s.isEmpty()) {
            result.add(ns);
            return result;
        }
        char ch = s.charAt(0);
        helper(s.substring(1), ns + ch, result);
        helper(s.substring(1), ns, result);
        return result;
    }
}
