package String;

import java.util.ArrayList;

public class longestPalindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != ':') {
                list.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(list);
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            if (list.get(start) != list.get(end)) {
                System.out.println(false);
            }
            start++;
            end--;
        }

        System.out.println(true);
    }

}
