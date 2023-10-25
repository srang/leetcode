package com.github.srang.leetcode.p024_swap_node_pair;

import com.github.srang.leetcode.helper.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testNodePair1() {
        ListNode test = new ListNode(new int[]{1,2,3,4});
        ListNode answer = new ListNode(new int[]{2,1,4,3});
        assertEquals(answer.toString(), Solution.swapPairs(test).toString());
    }

    @Test
    void testNodePair2() {
        assertEquals(null, Solution.swapPairs(null));
    }

    @Test
    void testNodePair3() {
        ListNode test = new ListNode(new int[]{1});
        ListNode answer = new ListNode(new int[]{1});
        assertEquals(answer.toString(), Solution.swapPairs(test).toString());
    }

    @Test
    void testNodePair4() {
        ListNode test = new ListNode(new int[]{1,2,3,4,5});
        ListNode answer = new ListNode(new int[]{2,1,4,3,5});
        assertEquals(answer.toString(), Solution.swapPairs(test).toString());
    }

    @Test
    void testNodePair5() {
        ListNode test = new ListNode(new int[]{1,2,3,4,5,6,7,8,9,10});
        ListNode answer = new ListNode(new int[]{2,1,4,3,6,5,8,7,10,9});
        assertEquals(answer.toString(), Solution.swapPairs(test).toString());
    }

    @Test
    void testNodePair6() {
        ListNode test = new ListNode(new int[]{1,2});
        ListNode answer = new ListNode(new int[]{2,1});
        assertEquals(answer.toString(), Solution.swapPairs(test).toString());
    }
}
