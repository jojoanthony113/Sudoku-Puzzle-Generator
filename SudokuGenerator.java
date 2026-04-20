import java.util.ArrayList;

public class SudokuGenerator {

    public static void main(String[] args) {
        int[][] board = new int[9][9];

        fillBoard(board);

        if (isValidBoard(board)) {
            printBoard(board);
        } else {
            System.out.println("Error: Invalid Sudoku board.");
        }
    }

    public static void fillBoard(int[][] board) {
        ArrayList<Integer> baseRow = new ArrayList<Integer>();

        for (int i = 1; i <= 9; i++) {
            baseRow.add(i);
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int shift = (row * 3 + row / 3) % 9;
                board[row][col] = baseRow.get((col + shift) % 9);
            }
        }
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                printDivider();
            }

            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }

                System.out.print(board[row][col] + " ");
            }

            System.out.println();
        }
    }

    public static void printDivider() {
        System.out.println("------+-------+------");
    }

    public static boolean isValidBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[10];
            for (int col = 0; col < 9; col++) {
                int num = board[row][col];
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[10];
            for (int row = 0; row < 9; row++) {
                int num = board[row][col];
                if (seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        return true;
    }
}

