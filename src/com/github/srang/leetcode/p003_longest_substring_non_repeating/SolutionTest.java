package com.github.srang.leetcode.p003_longest_substring_non_repeating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test01() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test02() {
        assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test03() {
        assertEquals(0, Solution.lengthOfLongestSubstring(""));
    }

    @Test
    void test04() {
        assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test05() {
        assertEquals(12, Solution.lengthOfLongestSubstring("adfasdfadsffdajklajkjlksjdlfkjaslksdjflkaslkdjlkjlkjwelkrnelrwqeiuovzoicxurnewq"));
    }

    @Test
    void test06() {
        assertEquals(26, Solution.lengthOfLongestSubstring("abcdefghijklnopqrstuvwxyzabcdefghijklmnopqrsuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void test07() {
        assertEquals(9, Solution.lengthOfLongestSubstring("abcasdfaasdgahsghdfhsfgsdf. klgjsklfhasdfghabcbb"));
    }

    @Test
    void test08() {
        assertEquals(2, Solution.lengthOfLongestSubstring(".    "));
    }
    @Test
    void test09() {
        assertEquals(35, Solution.lengthOfLongestSubstring(".    abcdefghijklnopqrstuvwxyzabcdefgh ?_#*.473ijklmnopqrsuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void test10() {
        assertEquals(11, Solution.lengthOfLongestSubstring("abcasdfaasdgahsghdfhsfgsdf. _k?lgjsklfhasdfghabcbb"));
    }

    @Test
    void test11() {
        assertEquals(9, Solution.lengthOfLongestSubstring("abcdefbagkl"));
    }

    @Test
    void test12() {
        assertEquals(1, Solution.lengthOfLongestSubstring(" "));
    }

    @Test
    void test13() {
        assertEquals(2, Solution.lengthOfLongestSubstring(" _ "));
    }


}
