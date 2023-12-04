package Week12_Chess2;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * javadoc.
     */
    public boolean validate(int x, int y) {
        return x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT;
    }

    /**
     * javadoc.
     */
    public void addPiece(Piece piece) {
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();
        if (validate(x, y) && getAt(x, y) == null) {
            pieces.add(piece);
        }
    }

    /**
     * javadoc.
     */
    public void removeAt(int x, int y) {
        Piece removed = null;
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                removed = piece;
                break;
            }
        }
        if (removed != null) {
            pieces.remove(removed);
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

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}