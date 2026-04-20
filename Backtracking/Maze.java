package Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(2, 2));
    }

    static int count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }

        return count(row, column - 1) + count(row - 1, column);
    }
}
