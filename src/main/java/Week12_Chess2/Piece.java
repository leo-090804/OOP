package Week12_Chess2;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * javadoc.
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = "white";
    }

    /**
     * javadoc.
     */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * javadoc.
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * javadoc.
     */
    public abstract String getSymbol();

    /**
     * javadoc.
     */
    public abstract boolean canMove(Board board, int x, int y);
}
