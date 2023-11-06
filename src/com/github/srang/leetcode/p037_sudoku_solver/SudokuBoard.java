package com.github.srang.leetcode.p037_sudoku_solver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SudokuBoard {
    private BoardCell[][] cells;
    public static final int BOARD_SIZE = 9;
    public static final int BLOCK_SIZE = 3;
    public static final String INDEX_HTML = "src/resources/index.html";
    public SudokuBoard(char[][] board) {
        this.cells = new BoardCell[BOARD_SIZE][BOARD_SIZE];
        for(int i = 0; i < BOARD_SIZE; i++) {
            for(int j = 0; j < BOARD_SIZE; j++) {
                this.cells[i][j] = new BoardCell(i, j, board[i][j]);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            if (i % 3 == 0) {
                sb.append("+========+=========+========+\n");
            }
            for (int j = 0; j < BOARD_SIZE-1; j++) {
                if (j % 3 == 0) {
                    sb.append("|| ");
                }
                sb.append(this.cells[i][j].toString()).append(" ");
            }
            sb.append(this.cells[i][BOARD_SIZE-1]).append(" ||\n");
        }
        sb.append( "+========+=========+========+\n");
        return sb.toString();
    }

    public void print() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(INDEX_HTML));
        writer.append("<!DOCTYPE html><html><head>\n<link rel=\"stylesheet\" href=\"styles.css\">\n" +
                "</head>\n<body>\n<table class='board'>\n");
        for (int i = 0; i < this.BOARD_SIZE; i++) {
            writer.append("<tr class='board-row'>");
            for (int j = 0; j < BOARD_SIZE; j++) {
                writer.append(this.cells[i][j].print());
            }
            writer.append("</tr>\n");
        }
        writer.append("</table>\n</body>\n</html>");
        writer.close();
    }
}
