/**
 * Created by kaushikravi on 7/30/17.
 */
public class King extends Piece {


    public King(int initialRow, int initialCol) {
        setCurrRow(initialRow);
        setCurrCol(initialCol);
    }

    public boolean isValidMove(int i, int j) {
        return getValidMoves()[i][j];
    }

    public void setValidMoves() {

    }


}
