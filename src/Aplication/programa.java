package Aplication;

import BordGame.Board;
import Chess.ChessMatch;




public class programa {
    public static void main(String[] args) {

        //Board board = new Board(8,8);
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
