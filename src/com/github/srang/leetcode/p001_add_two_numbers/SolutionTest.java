package com.github.srang.leetcode.p001_add_two_numbers;

import com.github.srang.leetcode.helper.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(new int[]{1,2});
        ListNode l2 = new ListNode(new int[]{9,0,9});
        ListNode solution = new ListNode(new int[]{0, 3, 9});
        assertEquals(solution.toString(), Solution.addTwoNumbers(l1, l2).toString());
    }
}