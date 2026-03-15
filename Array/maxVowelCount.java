package Array;

public class maxVowelCount {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    static int maxVowels(String s, int k) {
        int countVowels = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                countVowels++;
            }
        }
        int maxVowels = countVowels;
        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                countVowels = countVowels + 1;
            }

            if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o'
                    || s.charAt(i - k) == 'u') {
                countVowels--;
            }

            maxVowels = Math.max(countVowels, maxVowels);
        }
        return maxVowels;
    }
}
