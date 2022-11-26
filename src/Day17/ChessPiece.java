package Day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"), ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), BISHOP_WHITE(3.5, "♗"), BISHOP_BLACK(3.5, "♝"), KNIGHT_WHITE(3, "♘"),
    KNIGHT_BLACK(3, "♞"), PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"), EMPTY(-1, "_");

    public double getValueChess() {
        return valueChess;
    }

    public void setValueChess(double valueChess) {
        this.valueChess = valueChess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double valueChess;
    private String name;

    ChessPiece(double valueChess, String name) {
        this.valueChess = valueChess;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
