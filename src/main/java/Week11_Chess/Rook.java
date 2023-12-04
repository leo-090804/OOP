package Week11_Chess;

public class Rook extends Piece {
    public Rook(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    public Rook(int coordinateX, int coordinateY, String newColor) {
        super(coordinateX, coordinateY, newColor);
    }

    /**
     * getSymbolRook
     *
     * @return
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * canMoveRook
     *
     * @param board
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (this.getCoordinatesX() == x) {
            int minY = Math.min(this.getCoordinatesY(), y);
            int maxY = Math.max(this.getCoordinatesY(), y);
            for (int i = minY + 1; i <= maxY; i++) {
                if (i < maxY) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
            }
        } else if (this.getCoordinatesY() == y) {
            int minX = Math.min(this.getCoordinatesX(), x);
            int maxX = Math.max(this.getCoordinatesX(), x);
            for (int i = minX + 1; i <= maxX; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        } else {
            return false;
        }

        Piece target = board.getAt(x, y);
        if (target == null || !target.getColor().equals(this.getColor())) {
            return true;
        } else {
            return false;
        }
    }
}