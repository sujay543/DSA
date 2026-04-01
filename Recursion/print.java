package Recursion;

public class print {
    public static void main(String args[]) {
        int i = 5;
        printuptoN(i);
    }

    static void printuptoN(int i) {
        if (i > 0) {
            printuptoN(i - 1);
            System.out.println(i);
        }

    }
}
