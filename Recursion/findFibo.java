package Recursion;

public class findFibo {
    public static void main(String args[]) {
        System.out.println(fibonachii(6));
    }

    static int fibonachii(int num) {
        if (num < 2) {
            return num;
        }
        return fibonachii(num - 1) + fibonachii(num - 2);
    }
}
