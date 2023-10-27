package com.github.srang.leetcode.p014_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test01() {
        assertEquals("", Solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void test02() {
        assertEquals("fl", Solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void test03() {
        assertEquals("", Solution.longestCommonPrefix(new String[]{"flower","flow","flight","afloat"}));
    }

    @Test
    void test04() {
        assertEquals("asdfasd", Solution.longestCommonPrefix(new String[]{"asdfasdaafasdfasdfasdf","asdfasdfjfdakdfsdkfa", "asdfasd", "asdfasdaffadf"}));
    }

    @Test
    void test05() {
        assertEquals("asdf", Solution.longestCommonPrefix(new String[]{"asdfasdaafasdfasdfasdf","asdfasdfjfdakdfsdkfa", "asdf", "asdfasdaffadf"}));
    }

    @Test
    void test06() {
        assertEquals("af", Solution.longestCommonPrefix(new String[]{"af"}));
    }

    @Test
    void test07() {
        assertEquals("a", Solution.longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    void test08() {
        assertEquals("", Solution.longestCommonPrefix(new String[]{""}));
    }
}
