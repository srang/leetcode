package com.github.srang.leetcode.roman_to_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToIntIII() {
        assertEquals(3, Solution.romanToInt("III"));
    }

    @Test
    void romanToIntLVIII() {
        assertEquals(58, Solution.romanToInt("LVIII"));
    }

    @Test
    void romanToIntXIV() {
        assertEquals(14, Solution.romanToInt("XIV"));
    }

    @Test
    void romanToIntLIX() {
        assertEquals(59, Solution.romanToInt("LIX"));
    }

    @Test
    void romanToIntMXL() {
        assertEquals(1040, Solution.romanToInt("MXL"));
    }

}