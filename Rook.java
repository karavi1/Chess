/**
 * Created by kaushikravi on 7/30/17.
 */
public class Rook extends Piece {

    public Rook(int initialRow, int initialCol) {
        setPointValue(5);
        setCurrRow(initialRow);
        setCurrCol(initialCol);
    }


    public boolean isValidMove(int i, int j) {
        return getValidMoves()[i][j];
    }

    public void setValidMoves() {

    }



}
