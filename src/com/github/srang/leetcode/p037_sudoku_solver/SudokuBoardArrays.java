package com.github.srang.leetcode.p037_sudoku_solver;

public class SudokuBoardArrays {
    private char[][] board;
    public SudokuBoardArrays(char[][] board) {
        this.board = board;
    }

    public char[][] getBoard() {
        return this.board;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.board.length; i++) {
            sb.append("[");
            for (int j = 0; j < this.board[i].length-1; j++) {
                sb.append(board[i][j]).append(", ");
            }
            sb.append(board[i][board[i].length-1]).append("]\n");
        }
        return sb.toString();
    }
}
