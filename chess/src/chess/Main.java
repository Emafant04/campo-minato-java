package chess;

import chess.Pieces.*;

public class Main {
    public static void main(String[] args) {
        Piece knight = new Knight(Player.WHITE);

        System.out.println("Simbolo cavallo: " + knight.getSymbol());
        System.out.println("Colore cavallo: " + knight.getColor());

        Board board = new Board();
        board.setPiece(4, 4, knight);

        System.out.println("Pezzo in (4,4): " + board.getPiece(4,4).getSymbol());
        System.out.println("Fuori limiti (8,8): " + Board.inBounds(8,8));

        System.out.println("Mosse cavallo: " + knight.generateMoves(board, 4, 4).size());

        var moves = knight.generateMoves(board, 4, 4);
        System.out.println("Mosse cavallo al centro:");
        for (Move m : moves) {
            System.out.println("(" + m.dstRow + "," + m.dstCol + ")");
        }

        board = new Board();
        board.setPiece(0, 0, knight);

        moves = knight.generateMoves(board, 0, 0);
        System.out.println("Mosse cavallo in angolo: " + moves.size());



    }
}
