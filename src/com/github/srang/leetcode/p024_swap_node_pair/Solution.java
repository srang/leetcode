package com.github.srang.leetcode.p024_swap_node_pair;

import com.github.srang.leetcode.helper.ListNode;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode tmp = head;
        if (tmp != null && tmp.next != null) {
            ListNode swap1 = head;
            ListNode swap2 = head.next;
            head = swap2;
            swap1.next = swapPairs(swap2.next);
            swap2.next = swap1;
        } else {
            return head;
        }


        return head;
    }
}
