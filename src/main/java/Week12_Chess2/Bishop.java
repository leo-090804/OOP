package Week12_Chess2;

public class Bishop extends Piece {

    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    /**
     * javadoc.
     */
    @Override
    public String getSymbol() {
        return "B";
    }

    /**
     * javadoc.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        int deltaX = Math.abs(x - this.getCoordinatesX());
        int deltaY = Math.abs(y - this.getCoordinatesY());
        if (deltaX != deltaY) {
            return false;
        }

        if (x > this.getCoordinatesX() && y > this.getCoordinatesY()) {
            int j = this.getCoordinatesY() + 1;
            for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                if (board.getAt(i, j) != null) {
                    return false;
                }
                j++;
            }
        }

        if (x < this.getCoordinatesX() && y < this.getCoordinatesY()) {
            int j = this.getCoordinatesY() - 1;
            for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                if (board.getAt(i, j) != null) {
                    return false;
                }
                j--;
            }
        }

        if (x > this.getCoordinatesX() && y < this.getCoordinatesY()) {
            int j = this.getCoordinatesY() - 1;
            for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                if (board.getAt(i, j) != null) {
                    return false;
                }
                j--;
            }
        }

        if (x < this.getCoordinatesX() && y > this.getCoordinatesY()) {
            int j = this.getCoordinatesY() + 1;
            for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                if (board.getAt(i, j) != null) {
                    return false;
                }
                j++;
            }
        }

        if (board.getAt(x, y) != null) {
            return !board.getAt(x, y).getColor().equals(this.getColor());
        }
        return true;
    }
}
