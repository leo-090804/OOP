package Week11_Chess;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public boolean validate(int x, int y) {
        return x <= WIDTH && x >= 1 && y <= HEIGHT && y >= 1;
    }

    /**
     * javadoc.
     */
    public void addPiece(Piece newPiece) {
        if (validate(newPiece.getCoordinatesX(), newPiece.getCoordinatesY())
                && getAt(newPiece.getCoordinatesX(), newPiece.getCoordinatesY()) == null) {
            pieces.add(newPiece);
        }
    }

    /**
     * javadoc.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * javadoc.
     */
    public void removeAt(int x, int y) {
        Piece removed = getAt(x, y);
        if (removed != null) {
            pieces.remove(removed);
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}