package Chess;

import BordGame.Board;

public class ChessMatch {
    private Board board;
    private Object ChessPiece;

    public ChessMatch(){
        board = new Board(8,8);

    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat= ChessPiece[board.getLinhas()][board.getColunas()];
        for (int i=0;i<board.getLinhas();i++){
            for(int j=0;board.getColunas();j++){
                    mat[i][j]=(ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}
