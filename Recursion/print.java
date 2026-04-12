package Recursion;

public class print {
    public static void main(String args[]) {
        int i = 5;
        printUptoN(i);
    }

    static void printUptoN(int num) {
        if (num < 0) {
            return;
        }

        printUptoN(num - 1);
        System.out.println(num);
    }

}
