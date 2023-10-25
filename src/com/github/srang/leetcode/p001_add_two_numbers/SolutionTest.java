package com.github.srang.leetcode.add_two_numbers;

import com.github.srang.leetcode.helper.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(new int[]{1,2});
        ListNode l2 = new ListNode(new int[]{9,0,9});
        ListNode answer = Solution.addTwoNumbers(l1, l2);
        ListNode sln = new ListNode(0,
                new ListNode(3,
                        new ListNode(9)));
        System.out.println("Answer: " + answer.toString());
        System.out.println("Solution: " + sln.toString());
        assertEquals(sln.toString(), answer.toString());
    }
}