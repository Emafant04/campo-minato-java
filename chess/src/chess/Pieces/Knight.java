package chess.Pieces;

import java.util.ArrayList;
import java.util.List;

import chess.Board;
import chess.Move;
import chess.Player;

public class Knight extends Piece {

    public Knight(Player color) {
        super(color);
    }

    @Override
    public char getSymbol() {
        return color == Player.WHITE ? 'N' : 'n';
    }

    @Override
    public List<Move> generateMoves(Board board, int row, int col) {
        List<Move> moves = new ArrayList<>();

        int[][] offsets = {
            {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
            { 1, -2}, { 1, 2}, { 2, -1}, { 2, 1}
        };

        for (int[] o : offsets) {
            int r = row + o[0];
            int c = col + o[1];

            if (Board.inBounds(r, c)) {
                Piece target = board.getPiece(r, c);
                if (target == null || target.getColor() != this.color) {
                    moves.add(new Move(row, col, r, c));
                }
            }
        }
        return moves;
    }

}
