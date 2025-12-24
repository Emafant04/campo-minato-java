package chess;

import chess.Pieces.Piece;

public class Board {

    private Piece[][] grid = new Piece[8][8];

    public Piece getPiece(int row, int col) {
        return grid[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        grid[row][col] = piece;
    }

    public static boolean inBounds(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}
