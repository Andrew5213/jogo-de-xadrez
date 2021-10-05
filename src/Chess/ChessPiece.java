package Chess;

import BordGame.Board;
import BordGame.Piece;

public class ChessPiece extends Piece {
    private Color Color;

    public ChessPiece(Board board, Chess.Color color) {
        super(board);
        Color = color;
    }

    public Chess.Color getColor() {
        return Color;
    }
}
