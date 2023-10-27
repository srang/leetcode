package com.github.srang.leetcode.p014_longest_common_prefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        /**
         * for each character in first string
         * check if other strings match
         * if mismatch - return substring
         * if reach end of any string - return substring
         */
        StringBuilder solution = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return solution.toString();
                }
            }
            solution.append(c);
        }
        return solution.toString();
    }
}
