package com.github.srang.leetcode.p037_sudoku_solver;

import java.util.*;

public class Solution {
    public static void solveSudoku(char[][] board) {
        int dimensions = board.length;
        boolean cellSolved = false;
        Map<String,Set<Character>> pencil = new HashMap<>();
        boolean flagSimpleElimination = true;
        boolean flagRemainingCell = true;
        boolean flagRowCompletion = true;
        boolean flagColumnCompletion = true;
        boolean flagHiddenPairs = true;
        do {
            cellSolved = false;

            /* Simple Elimination Strategies
             * Eliminate options based on filled cells in row
             * Eliminate options based on filled cells in column
             * Eliminate options based on filled cells in block
             */
            if(flagSimpleElimination) {
                for (int i = 0; i < dimensions; i++) {
                    for (int j = 0; j < dimensions; j++) {
                        Set<Character> possible =
                                new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
                        if (board[i][j] == '.') {
                            // Row elimination
                            for (int x = 0; x < dimensions; x++) {
                                if (x != j) {
                                    possible.remove(board[i][x]);
                                }
                            }
                            if (possible.size() == 1) {
                                board[i][j] = possible.stream().findFirst().get();
                                cellSolved = true;
                                //pencil.computeIfPresent(String.format("%d,%d",i,j), (k, v) -> { v.remove("a2"); return v; })
                                pencil.remove(String.format("%d,%d", i, j));
                                continue;
                            } else if (possible.isEmpty()) {
                                System.out.println("ERROR, empty possiblity List");
                            }
                            // Column elimination
                            for (int x = 0; x < dimensions; x++) {
                                if (x != i) {
                                    possible.remove(board[x][j]);
                                }
                            }
                            if (possible.size() == 1) {
                                board[i][j] = possible.stream().findFirst().get();
                                cellSolved = true;
                                pencil.remove(String.format("%d,%d", i, j));
                                continue;
                            } else if (possible.isEmpty()) {
                                System.out.println("ERROR, empty possiblity List");
                            }
                            // Block elimination
                            for (int x = i - i % 3; x < i - i % 3 + 3; x++) {
                                for (int y = j - j % 3; y < j - j % 3 + 3; y++) {
                                    if (x != i && y != j) {
                                        possible.remove(board[x][y]);
                                    }
                                }
                            }
                            if (possible.size() == 1) {
                                board[i][j] = possible.stream().findFirst().get();
                                cellSolved = true;
                                pencil.remove(String.format("%d,%d", i, j));
                                continue;
                            } else if (possible.isEmpty()) {
                                System.out.println("ERROR, empty possiblity List");
                            }
                            // Block completion
                            for (int x = i - i % 3; x < i - i % 3 + 3; x++) {
                                for (int y = j - j % 3; y < j - j % 3 + 3; y++) {
                                    if (x != i && y != j) {
                                        possible.remove(board[x][y]);
                                    }
                                }
                            }
                            if (possible.size() == 1) {
                                board[i][j] = possible.stream().findFirst().get();
                                cellSolved = true;
                                pencil.remove(String.format("%d,%d", i, j));
                                continue;
                            } else if (possible.isEmpty()) {
                                System.out.println("ERROR, empty possiblity List");
                            }
                            pencil.put(String.format("%d,%d", i, j), possible);
                        }
                    }
                }
            }
            /* Complex Strategies
             * Only available square (block, column, row)
             * Pointing possibilities
             * hidden Pairs
             * Triplets
             * last remaining pairs/triplets
             * hidden pointers
             */
            if (!cellSolved && flagRemainingCell) {
                // Only Available Square
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        // reduce set to remaining required numbers and unfilled indices
                        Set<Character> required =
                                new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
                        Set<String> unfilledIndices = new HashSet<>();
                        for (int x = 3 * i; x < 3 * i + 3; x++) {
                            for (int y = 3 * j; y < 3 * j + 3; y++) {
                                if (board[x][y] != '.') {
                                    required.remove(board[x][y]);
                                } else {
                                    unfilledIndices.add(String.format("%d,%d", x, y));
                                }
                            }
                        }
                        for(Character c : required) {
                            Set<String> possible = new HashSet<>();
                            for(String index : unfilledIndices) {
                                if(pencil.get(index).contains(c)) {
                                    possible.add(index);
                                }
                            }
                            if (possible.size() == 1) {
                                String index = possible.stream().findFirst().get();
                                int x = Integer.parseInt(index.split(",")[0]);
                                int y = Integer.parseInt(index.split(",")[1]);
                                board[x][y] = c;
                                cellSolved = true;
                                unfilledIndices.remove(index);
                                pencil.remove(index);
                                continue;
                            }
                        }
                    }
                }
            }
            if (!cellSolved && flagRowCompletion) {
                /*
                 * for each row
                 * find unfilled indices and required digits
                 * for each required digit
                 * for each unfilled index
                 * see if pencil[index] contains required digit
                 * if size = 1, place character
                 */
                for(int x = 0; x < dimensions; x++) {
                    Set<Character> required =
                            new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
                    Set<String> unfilledIndices = new HashSet<>();
                    for(int y = 0; y < dimensions; y++) {
                        if (board[x][y] != '.') {
                            required.remove(board[x][y]);
                        } else {
                            unfilledIndices.add(String.format("%d,%d", x, y));
                        }
                    }
                    for(Character c : required) {
                        Set<String> possible = new HashSet<>();
                        for(String index : unfilledIndices) {
                            if(pencil.get(index).contains(c)) {
                                possible.add(index);
                            }
                        }
                        if (possible.size() == 1) {
                            String index = possible.stream().findFirst().get();
                            int y = Integer.parseInt(index.split(",")[1]);
                            board[x][y] = c;
                            cellSolved = true;
                            unfilledIndices.remove(index);
                            pencil.remove(index);
                            continue;
                        }
                    }
                }
            }
            if (!cellSolved && flagColumnCompletion) {
                /*
                 * for each row
                 * find unfilled indices and required digits
                 * for each required digit
                 * for each unfilled index
                 * see if pencil[index] contains required digit
                 * if size = 1, place character
                 */
                for(int y = 0; y < dimensions; y++) {
                    Set<Character> required =
                            new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
                    Set<String> unfilledIndices = new HashSet<>();
                    for(int x = 0; x < dimensions; x++) {
                        if (board[x][y] != '.') {
                            required.remove(board[x][y]);
                        } else {
                            unfilledIndices.add(String.format("%d,%d", x, y));
                        }
                    }
                    Map<String, Set<Character>> hiddenPairs = new HashMap();
                    for(Character c : required) {
                        Set<String> possible = new HashSet<>();
                        for(String index : unfilledIndices) {
                            if(pencil.get(index).contains(c)) {
                                possible.add(index);
                            }
                        }
                        if (possible.size() == 1) {
                            String index = possible.stream().findFirst().get();
                            int x = Integer.parseInt(index.split(",")[0]);

                            board[x][y] = c;
                            cellSolved = true;
                            unfilledIndices.remove(index);
                            pencil.remove(index);
                            continue;
                        } else if (possible.size() == 2 && flagHiddenPairs) {
                            String key = Arrays.toString(possible.toArray());
                            if (hiddenPairs.containsKey(key)) {
                                hiddenPairs.get(key).add(c);
                            } else {
                                hiddenPairs.put(key, new HashSet<>(Arrays.asList(c)));
                            }
                        }
                    }
                    if (flagHiddenPairs && hiddenPairs.size() >= 2) {
                        for (String pairedIndices : hiddenPairs.keySet()) {
                            System.out.println("Index: " + pairedIndices + "; Value: " + Arrays.asList(hiddenPairs.get(pairedIndices)));
                        }
                    }
                }
            }

        } while (cellSolved);
    }
}
