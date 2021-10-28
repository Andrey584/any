package Day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9,  "♕"), ROOK_WHITE(5, "♖"),
    BISHOP_WHITE(3.5, "♗"), KHIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOP_BLACK(3.5, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"), EMPTY(-1,"_");
    private String representation;
    private double value;

    ChessPiece(double value, String representation){
        this.value = value;
        this.representation = representation;

    }


    public String getRepresentation() {
        return representation;
    }

}
