package Recursion;

public class addDigits {
    public static void main(String args[]) {
        int num = 134267;
        System.out.println(findsum(num));
    }

    static int findsum(int num) {
        if (num < 10) {
            return num;
        }
        int digit = num % 10;
        return digit + findsum(num / 10);
    }
}
