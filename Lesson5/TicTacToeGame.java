import java.io.*;
import java.util.Arrays;

class TicTacToeGame {
    private int[][] board;

    public TicTacToeGame() {
        board = new int[3][3];
    }

    public void setCell(int row, int col, int value) {
        board[row][col] = value;
    }

    public void saveToFile(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int[] row : board) {
                for (int cell : row) {
                    dos.writeInt(cell);
                }
            }
            System.out.println("Game saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            for (int[] row : board) {
                for (int i = 0; i < row.length; i++) {
                    row[i] = dis.readInt();
                }
            }
            System.out.println("Game loaded from " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                if (cell == 0) {
                    System.out.print("• ");
                } else if (cell == 1) {
                    System.out.print("X ");
                } else if (cell == 2) {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}