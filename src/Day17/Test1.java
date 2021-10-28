package Day17;

public class Test1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };

        for(ChessPiece pieces1 : pieces)
            System.out.print(pieces1.getRepresentation() + " ");



    }
}
