package chess;

public class Move {
    public final int srcRow;
    public final int srcCol;
    public final int dstRow;
    public final int dstCol;

    public Move(int srcRow, int srcCol, int dstRow, int dstCol) {
        this.srcRow = srcRow;
        this.srcCol = srcCol;
        this.dstRow = dstRow;
        this.dstCol = dstCol;
    }
}
