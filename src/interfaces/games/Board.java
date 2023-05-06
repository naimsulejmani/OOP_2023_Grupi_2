package interfaces.games;

public class Board {
    private int[][] board;

    public Board(int rows, int cols) {
        board = new int[rows][cols];
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
}
