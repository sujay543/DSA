package String;

public class longestContinuousSubstring {
    public static void main(String args[]) {
        String s = "abacaba";
        System.out.println(longestContinuousSubstring(s));
    }

    static int longestContinuousSubstring(String s) {
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i - 1) == 1) {
                count++;
            } else {
                maxCount = Integer.max(maxCount, count);
                count = 1;
            }
        }

        maxCount = Integer.max(maxCount, count);
        return maxCount;
    }
}
