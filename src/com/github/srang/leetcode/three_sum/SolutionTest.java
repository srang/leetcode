package com.github.srang.leetcode.three_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testThreeSum1() {
        assertEquals("[[-1, -1, 2], [-1, 0, 1]]",
                Solution.threeSum(new int[]{-1,0,1,2,-1,-4}).toString());
    }

    @Test
    void testThreeSum2() {
        assertEquals("[]",
                Solution.threeSum(new int[]{0,1,1}).toString());
    }

    @Test
    void testThreeSum3() {
        assertEquals("[[0, 0, 0]]",
                Solution.threeSum(new int[]{0,0,0}).toString());
    }

    @Test
    void testThreeSum4() {
        assertEquals("[[-1, -1, 2], [-3, 1, 2], [-1, 0, 1]]",
                Solution.threeSum(new int[]{-1,0,1,2,-1,-3}).toString());
    }

    @Test
    void testThreeSum5() {
        assertEquals("[[-1, -1, 2], [-3, -3, 6], [-3, 1, 2], [-1, 0, 1]]",
                Solution.threeSum(new int[]{-1,0,1,2,-1,-3,-3,6}).toString());
    }

    @Test
    void testThreeSum6() {
        assertEquals("[[-3, -1, 4], [-1, -1, 2], [-3, -3, 6], [-3, 1, 2], [-1, 0, 1]]",
                Solution.threeSum(new int[]{-1,0,-1,1,2,-1,-3,-3,6,4,2}).toString());
    }

}