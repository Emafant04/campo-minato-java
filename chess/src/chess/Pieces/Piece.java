package chess.Pieces;

import chess.Player;
import chess.Board;
import chess.Move;
import java.util.List;

public abstract class Piece {

    protected Player color;

    public Piece(Player color) {
        this.color = color;
    }

    public Player getColor() {
        return color;
    }

    public boolean isWhite() {
        return color == Player.WHITE;
    }

    // simbolo del pezzo: 'P', 'r', 'K', ecc.
    public abstract char getSymbol();

    // ogni pezzo sa come muoversi
    public abstract List<Move> generateMoves(Board board, int row, int col);
}
