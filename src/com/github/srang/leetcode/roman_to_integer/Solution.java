package com.github.srang.leetcode.roman_to_integer;

public class Solution {
    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    public static int romanToInt(String s) {
        int solution = 0;
        int current = 0;
        int previous = 0;
        for (int i = 0; i < s.length(); i++){
            current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> current;
            };
            if (current > previous) {
                solution -= 2 * previous;
            }
            previous = current;
            solution += current;
        }
        return solution;
    }
}
