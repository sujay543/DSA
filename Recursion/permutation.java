package Recursion;

class permutation {
    public static void main(String[] args) {
        String s = "abcde";
        findSubsets(s, " ");
    }

    static void findSubsets(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        String ns = String.valueOf(s.charAt(0));
        findSubsets(s.substring(1), ans + ns);
        findSubsets(s.substring(1), ans);
    }
}
