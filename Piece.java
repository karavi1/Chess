/**
 * Created by kaushikravi on 7/30/17.
 */
public abstract class Piece {


    // Point value for each piece
    private int pointValue;
    // Boolean Matrix of ValidMoves (will need to dynamically change when move is called)
    private boolean[][] validMoves = new boolean[8][8];
    // Piece's current row
    private int currRow;
    // Piece's current column
    private int currCol;

    public int getPointValue() {
        return pointValue;
    }

    public boolean[][] getValidMoves() {
        return validMoves;
    }

    public int getCurrRow() {
        return currRow;
    }

    public int getCurrCol() {
        return currCol;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public void setValidMoves(boolean[][] validMoves) {
        this.validMoves = validMoves;
    }

    public void setCurrRow(int currRow) {
        this.currRow = currRow;
    }

    public void setCurrCol(int currCol) {
        this.currCol = currCol;
    }

    public abstract boolean isValidMove(int i, int j);

    public abstract void setValidMoves();





}
