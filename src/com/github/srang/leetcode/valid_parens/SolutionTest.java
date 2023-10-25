package com.github.srang.leetcode.valid_parens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testParen1() {
        assertFalse(Solution.isValid("((("));
    }
    @Test
    void testParen2() {
        assertTrue(Solution.isValid("()"));
    }
    @Test
    void testParen3() {
        assertTrue(Solution.isValid("((()))"));
    }
    @Test
    void testParen4() {
        assertTrue(Solution.isValid("()(({}[]))"));
    }
    @Test
    void testParen5() {
        assertFalse(Solution.isValid("()(({}[]){)"));
    }
    @Test
    void testParen6() {
        assertFalse(Solution.isValid("()(({}[]){)"));
    }
    @Test
    void testParen7() {
        assertFalse(Solution.isValid("([])(({}[]){)"));
    }
    @Test
    void testParen8() {
        assertFalse(Solution.isValid("]"));
    }
}