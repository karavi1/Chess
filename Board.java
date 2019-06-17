public class Board {

    private Piece[][] master;

    public void initialize() {
        Player p1 = new Player(true);
        Player p2 = new Player(false);
    }

	public Board() {

        master = new Piece[8][8];
    }

	public void move(Player currPlayer, Piece currPiece, int row, int col) {

    }


    // Nested Class for the 2 Players to access the same board
    public class Player {


        public Player(boolean white) {
            if (white) {
                for (int i = 0; i < 8; i++) {
                    master[i][1] = new Pawn(i, 1);
                }
                master[0][0] = new Rook(0, 0);
                master[1][0] = new Knight(1, 0);
                master[2][0] = new Bishop(2, 0);
                master[3][0] = new Queen(3, 0);
                master[4][0] = new King(4, 0);
                master[5][0] = new Bishop(5, 0);
                master[6][0] = new Knight(6, 0);
                master[7][0] = new Rook(7, 0);

            } else {
                for (int i = 0; i < 8; i++) {
                    master[i][6] = new Pawn(i, 6);
                }
                master[0][7] = new Rook(0, 7);
                master[1][7] = new Knight(1, 7);
                master[2][7] = new Bishop(2, 7);
                master[3][7] = new Queen(3, 7);
                master[4][7] = new King(4, 7);
                master[5][7] = new Bishop(5, 7);
                master[6][7] = new Knight(6, 7);
                master[7][7] = new Rook(7, 7);
            }

        }

        public Piece[][] getMasterBoard() {
            return master;
        }

    }






}