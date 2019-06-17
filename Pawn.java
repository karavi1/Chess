/**
 * Created by kaushikravi on 7/30/17.
 */
public class Pawn extends Piece {




    public Pawn(int initialRow, int initialCol) {
        setPointValue(1);
        setCurrRow(initialRow);
        setCurrCol(initialCol);
    }

    public void advancement() {

    }

    public boolean isValidMove(int i, int j) {
        return getValidMoves()[i][j];
    }

    public void setValidMoves() {

    }



}
