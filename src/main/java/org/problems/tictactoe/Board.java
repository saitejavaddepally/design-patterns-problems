package org.problems.tictactoe;
import java.util.*;


public class Board {

    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean getFreeCells() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return true;
                }
            }
        }

        return false;
    }




    public boolean addPiece(PlayingPiece piece, int row, int col){

        if (row >= size || col >= size){
            return false;
        }

        if (board[row][col] != null){
            return false;
        }

        board[row][col] = piece;

        return true;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }



}
