package Recursion;

public class printStars {
    public static void main(String args[]) {
        int num = 4;
        print(num);
    }

    static void print(int num) {
        if (num == 0) {
            return;
        }
        for (int i = 0; i < num; i++) {
            System.out.print('*');
        }
        System.out.println("");
        print(num - 1);
    }
}
