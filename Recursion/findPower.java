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
        if (n == 1) {
            return x;
        }
        return myPow(x, n / 2) * myPow(x, n / 2);
    }
}
