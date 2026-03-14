package String;

import java.util.HashMap;

// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
public class romantoInt {
    public static void main(String args[]) {
        String s = "MCMXCIV";

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        total += map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i - 1))) {
                total -= map.get(s.charAt(i));
            } else {
                total += map.get(s.charAt(i));
            }
        }
        System.out.println(total);

    }
}
