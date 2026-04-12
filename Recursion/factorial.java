package Recursion;

public class factorial {
    public static void main(String args[]) {
        int num = 5;
        int result = findFactorial(num);
        System.out.println(result);
    }

    static int findFactorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }
}
