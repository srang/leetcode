package com.github.srang.leetcode.integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void intToRomanIII() {
        assertEquals("III", Solution.intToRoman(3));
    }

    @Test
    void intToRomanMMDCCLVII() {
        assertEquals("MMDCCLVII", Solution.intToRoman(2757));
    }

    @Test
    void intToRomanCMXLIV() {
        assertEquals("CMXLIV", Solution.intToRoman(944));
    }

    @Test
    void intToRomanMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Solution.intToRoman(3999));
    }

    @Test
    void intToRomanLVIII() {
        assertEquals("LVIII", Solution.intToRoman(58));
    }

    @Test
    void intToRomanIX() {
        assertEquals("IX", Solution.intToRoman(9));
    }

    @Test
    void intToRomanXL() {
        assertEquals("XL", Solution.intToRoman(40));
    }

    @Test
    void intToRomanXC() {
        assertEquals("XC", Solution.intToRoman(90));
    }

    @Test
    void intToRomanCDXCIX() {
        assertEquals("CDXCIX", Solution.intToRoman(499));
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

    @Test
    void intToRomanCDXLIV() {
        assertEquals("CDXLIV", Solution.intToRoman(444));
    }
}