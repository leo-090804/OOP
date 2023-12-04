package Week11_Chess;

public class Main {
    public static void main(String[] args) {
        Rook newRook = new Rook(1, 1, "white");
        Move newMove =
                new Move(newRook.getCoordinatesX(), 8, newRook.getCoordinatesY(), 8, newRook);
        System.out.println(newMove.toString());
    }
}
