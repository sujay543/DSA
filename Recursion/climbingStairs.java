package Recursion;

public class climbingStairs {
    public static void main(String[] args) {
        int num = 3;
        int result = climbStairs(num, 0);
        System.out.println(result);
    }

    static int climbStairs(int num, int count) {
        if (num == 0) {
            count = count + 1;
            return count;
        }

        if (num < 0) {
            return count;
        }
        climbStairs(num - 1, count);
        num = num + 1;
        climbStairs(num - 2, count);
        return count;
    }
}
