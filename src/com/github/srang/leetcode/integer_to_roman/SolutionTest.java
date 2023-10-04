package com.github.srang.leetcode.integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void intToRomanIII() {
        assertEquals("III", Solution.intToRoman(3));
    }

    @Test
    void intToRomanLVIII() {
        assertEquals("LVIII", Solution.intToRoman(58));
    }

    @Test
    void intToRomanXIV() {
        assertEquals("XIV", Solution.intToRoman(14));
    }
    @Test
    void intToRomanLIX() {
        assertEquals("LIX", Solution.intToRoman(59));
    }
    @Test
    void intToRomanMXL() {
        assertEquals("MXL", Solution.intToRoman(1040));
    }
}