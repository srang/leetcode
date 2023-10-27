package com.github.srang.leetcode.p003_longest_substring_non_repeating;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        /**
         * for each character in string,
         * calculate length of substring
         * add next character
         * check if substring (set) is longer
         */
        int solution = (s.length() > 0) ? 1 : 0;
        for(int i = 0; i < s.length(); i++) {
            Set<Character> substring = new HashSet<>();
            int j = i + 1;
            substring.add(s.charAt(i));
            int tmp = substring.size();
            while(j < s.length()) {
                substring.add(s.charAt(j));
                int substring_size = substring.size();
                if (tmp == substring_size || j == s.length()-1) {
                    solution = Math.max(substring_size, solution);
                    break;
                }
                tmp = substring_size;
                j++;
            }
        }
        return solution;
    }
}
