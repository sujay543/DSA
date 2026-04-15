package Recursion;

public class findPower {
    public static void main(String[] args) {
        int num = 2;
        int power = 10;
        System.out.println(myPow(num, power));
    }

    static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}
