package Recursion;

public class reducetoZero {
    static void main(String args[]) {
        int number = 14;
        int result = steps(number, 0);
        System.out.println(result);
    }

    static int steps(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            count++;
            return steps(num / 2, count);
        } else {
            count++;
            return steps(num - 1, count);
        }
    }
}
