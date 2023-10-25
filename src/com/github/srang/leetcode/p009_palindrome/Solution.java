package com.github.srang.leetcode.p009_palindrome;

public class Solution {
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int len = num.length();
        for (int i = 0; i < len / 2; i++) {
            if (num.charAt(i) != num.charAt(len - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
