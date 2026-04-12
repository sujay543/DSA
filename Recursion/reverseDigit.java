package Recursion;

public class reverseDigit {
    public static void main(String args[]) {
        int num = 1284;
        System.out.println(reverse(num));
    }

    static int reverse(int num) {
        if (num < 10) {
            return num;
        }
        int lastDigit = num % 10;
        int digits = (int) Math.log10(num);
        return lastDigit * (int) Math.pow(10, digits) + reverse(num / 10);
    }

}