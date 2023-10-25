package com.github.srang.leetcode.p021_merge_two_sorted_lists;

import com.github.srang.leetcode.helper.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testMerge1() {
        ListNode l1 = new ListNode(new int[]{1, 2, 3});
        ListNode l2 = new ListNode(new int[]{1, 4, 5});
        assertEquals("[1, 1, 2, 3, 4, 5]", Solution.mergeTwoLists(l1, l2).toString());
    }

    @Test
    void testMerge2() {
        assertEquals(null, Solution.mergeTwoLists(null, null));
    }

    @Test
    void testMerge3() {
        ListNode l1 = new ListNode(new int[]{1, 2, 3, 8, 11});
        ListNode l2 = new ListNode(new int[]{1, 4, 5});
        assertEquals("[1, 1, 2, 3, 4, 5, 8, 11]", Solution.mergeTwoLists(l1, l2).toString());
    }

    @Test
    void testMerge4() {
        ListNode l1 = new ListNode(new int[]{1, 2, 3});
        ListNode l2 = new ListNode(new int[]{1, 2, 5, 6, 8});
        assertEquals("[1, 1, 2, 2, 3, 5, 6, 8]", Solution.mergeTwoLists(l1, l2).toString());
    }

    @Test
    void testMerge5() {
        ListNode l1 = new ListNode(new int[]{1, 2, 3});
        assertEquals("[1, 2, 3]", Solution.mergeTwoLists(l1, null).toString());
    }

    @Test
    void testMerge6() {
        ListNode l2 = new ListNode(new int[]{1, 4, 5});
        assertEquals("[1, 4, 5]", Solution.mergeTwoLists(null, l2).toString());
    }

    @Test
    void testMerge7() {
        ListNode l1 = new ListNode(new int[]{1, 2, 3, 8, 11, 12});
        ListNode l2 = new ListNode(new int[]{1, 4, 5, 14});
        assertEquals("[1, 1, 2, 3, 4, 5, 8, 11, 12, 14]", Solution.mergeTwoLists(l1, l2).toString());
    }

    @Test
    void testMerge8() {
        ListNode l1 = new ListNode(new int[]{1, 4, 5, 14});
        ListNode l2 = new ListNode(new int[]{1, 2, 3, 8, 11, 12});
        assertEquals("[1, 1, 2, 3, 4, 5, 8, 11, 12, 14]", Solution.mergeTwoLists(l1, l2).toString());
    }


}