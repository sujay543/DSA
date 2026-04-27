package Recursion;

public class findSum {
    public static void main(String args[]) {
        int num = 5;
        System.out.println(returnSum(num, 0));
        System.out.println(functionalReturnSum(num));
        System.out.println(returnFatorial(num));
    }

    static int returnSum(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        sum += num;
        return returnSum(num - 1, sum);
    }

    static int functionalReturnSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + functionalReturnSum(num - 1);
    }

    static int returnFatorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * returnFatorial(num - 1);
    }
}
