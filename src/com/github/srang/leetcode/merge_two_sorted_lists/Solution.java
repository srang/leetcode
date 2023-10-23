package com.github.srang.leetcode.merge_two_sorted_lists;

import com.github.srang.leetcode.helper.ListNode;

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        ListNode tmp = new ListNode();
        ListNode solution = tmp;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tmp.val = list1.val;
                list1 = list1.next;
            } else {
                tmp.val = list2.val;
                list2 = list2.next;
            }
            tmp.next = new ListNode();
            tmp = tmp.next;
        }
        if (list1 != null) {
            tmp.val = list1.val;
            tmp.next = list1.next;
        } else {
            tmp.val = list2.val;
            tmp.next = list2.next;
        }
        return solution;
    }
}
