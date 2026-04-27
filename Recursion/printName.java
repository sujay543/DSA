package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printName {
    public static void main(String args[]) {
        String name = "sujay";
        int n = 3;
        // printName(name, 3);
        // System.out.println(printUptoN(0, n, new ArrayList<>()));
        // System.out.println(printNto0(n, new ArrayList<>()));
        System.out.println(BackTrackprintUptoN(n, new ArrayList<>()));
        System.out.println(BackTrackprintNto0(0, n, new ArrayList<>()));
    }

    static void printName(String name, int numberOftimes) {
        if (numberOftimes == 0) {
            return;
        }
        System.out.println(name);
        printName(name, numberOftimes - 1);
    }

    static List<Integer> printUptoN(int start, int end, List<Integer> list) {
        if (start > end) {
            return list;
        }

        list.add(start);
        return printUptoN(start + 1, end, list);
    }

    static List<Integer> printNto0(int n, List<Integer> list) {
        if (n < 0) {
            return list;
        }
        list.add(n);
        return printNto0(n - 1, list);
    }

    static List<Integer> BackTrackprintUptoN(int num, List<Integer> list) {
        if (num < 0) {
            return list;
        }
        BackTrackprintUptoN(num - 1, list);
        list.add(num);
        return list;
    }

    static List<Integer> BackTrackprintNto0(int i, int n, List<Integer> list) {
        if (i > n) {
            return list;
        }
        BackTrackprintNto0(i + 1, n, list);
        list.add(i);
        return list;
    }
}
