package Week11_Chess;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * javadoc.
     */
    public Piece(int coordinateX, int coordinateY) {
        this.coordinatesX = coordinateX;
        this.coordinatesY = coordinateY;
        this.color = "white";
    }

    /**
     * javadoc.
     */
    public Piece(int coordinateX, int coordinateY, String newColor) {
        this.coordinatesX = coordinateX;
        this.coordinatesY = coordinateY;
        this.color = newColor;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinateX) {
        this.coordinatesX = coordinateX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinateY) {
        this.coordinatesY = coordinateY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);
}