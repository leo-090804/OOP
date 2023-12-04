package Week11_Chess;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board newBoard) {
        board = newBoard;
        this.moveHistory = new ArrayList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    /**
     * javadoc.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece killedPiece = board.getAt(x, y);
            Move newMove;
            if (killedPiece != null) {
                newMove = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece,
                        killedPiece);
                board.removeAt(x, y);
            } else {
                newMove = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(), x, y, piece);
            }
            moveHistory.add(newMove);

            board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            board.addPiece(piece);
        }
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}