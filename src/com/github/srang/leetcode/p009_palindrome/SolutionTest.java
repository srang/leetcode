package com.github.srang.leetcode.p009_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void test1() {
        assertTrue(Solution.isPalindrome(121));
    }

    @Test
    void test2() {
        assertTrue(Solution.isPalindrome(12221));
    }

    @Test
    void test3() {
        assertFalse(Solution.isPalindrome(-121));
    }

    @Test
    void test4() {
        assertFalse(Solution.isPalindrome(10));
    }
}
