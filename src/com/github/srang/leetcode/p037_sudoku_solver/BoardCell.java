package com.github.srang.leetcode.p037_sudoku_solver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BoardCell {
    private int x;
    private int y;
    private char val;
    private Set<Character> possibleCells;

    public BoardCell(int x, int y) {
        this(x, y, '.');
    }

    public BoardCell(int x, int y, char val) {
        this.x = x;
        this.y = y;
        this.val = val;
        this.possibleCells = new HashSet<>();
    }

    public String toString() {
        return String.valueOf(this.val);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("<td class='board-cell'><table class='inner-cell-table'");
        if (this.val != '.') {
            sb.append("<tr class='inner-cell-row'>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("</tr>\n");
            sb.append("<tr class='inner-cell-row'>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("<td class='inner-cell'>").append(this.val).append("</td>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("</tr>\n");
            sb.append("<tr class='inner-cell-row'>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("<td class='inner-cell'>*</td>\n")
                    .append("</tr>\n");
        }
        sb.append("</table></td>");
        return sb.toString();
    }

}
