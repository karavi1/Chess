/**
 * Created by kaushikravi on 7/30/17.
 */
public class Queen extends Piece {

    public Queen(int initialRow, int initialCol) {
        setPointValue(9);
        setCurrRow(initialRow);
        setCurrCol(initialCol);
    }


    public boolean isValidMove(int i, int j) {
        return getValidMoves()[i][j];
    }

    public void setValidMoves() {

    }

}
