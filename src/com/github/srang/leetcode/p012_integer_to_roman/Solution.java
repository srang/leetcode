package com.github.srang.leetcode.integer_to_roman;

public class Solution {
    public static String intToRoman(int num) {
        int div = 0;
        StringBuilder stringBuilder = new StringBuilder();
        num = helper1(num, "M", 1000, stringBuilder);
        num = helper1(num, "D", 500, stringBuilder);
        num = helper1(num, "C", 100, stringBuilder);
        num = helper1(num, "L", 50, stringBuilder);
        num = helper1(num, "X", 10, stringBuilder);
        num = helper1(num, "V", 5, stringBuilder);
        helper1(num, "I", 1, stringBuilder);
        helper2(stringBuilder, "IIII", "IV");
        helper2(stringBuilder, "VIV", "IX");
        helper2(stringBuilder, "XXXX", "XL");
        helper2(stringBuilder, "LXL", "XC");
        helper2(stringBuilder, "CCCC", "CD");
        helper2(stringBuilder, "DCD", "CM");

        return stringBuilder.toString();
    }
    private static int helper1(int num, String roman, int val, StringBuilder stringBuilder) {
        int div = num / val;
        stringBuilder.append(roman.repeat(Math.max(0, div)));
        return num % val;
    }
    private static void helper2(StringBuilder stringBuilder, String seq, String rep) {
        int index = stringBuilder.indexOf(seq);
        if (index >= 0) {
            stringBuilder.replace(index, index+seq.length(), rep);
        }
    }
}
