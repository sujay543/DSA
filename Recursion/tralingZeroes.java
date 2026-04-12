package Recursion;

public class tralingZeroes {
    public static void main(String args[]) {
        int num = 601;
        System.out.println(countZeroes(num, 0));
    }

    static int countZeroes(int num, int count) {
        if (num == 0) {
            return count;
        }

        if (num % 10 == 0) {
            count++;
        }

        return countZeroes(num / 10, count);
    }

}
