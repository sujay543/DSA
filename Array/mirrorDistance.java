package Array;

public class mirrorDistance {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(mirrorDistance(num));
    }

    static int mirrorDistance(int n) {
        int revNumber = reverse(n);
        n -= revNumber;
        return Math.abs(n);
    }

    static int reverse(int n) {
        int val = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            val = val * 10 + lastdigit;
            n = n / 10;
        }

        return val;
    }
}
