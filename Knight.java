/**
 * Created by kaushikravi on 7/30/17.
 */
public class Knight extends Piece {


    public Knight(int initialRow, int initialCol) {
        setPointValue(3);
        setCurrRow(initialRow);
        setCurrCol(initialCol);
    }

    public boolean isValidMove(int i, int j) {
        return getValidMoves()[i][j];
    }

    public void setValidMoves() {

    }

}
