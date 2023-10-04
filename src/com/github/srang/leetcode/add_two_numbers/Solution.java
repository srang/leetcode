package com.github.srang.leetcode.add_two_numbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int val = l1.val + l2.val;
        System.out.println(l1);
        if (val >= 10) {
            carry = 1;
            val -= 10;
        }
        if (l1.next != null && l2.next != null) {
            l1.next.val += carry;
            return new ListNode(val,
                    addTwoNumbers(l1.next, l2.next));
        } else if (l1.next == null && l2.next == null) {
            // if l1&l2.next == null, set sum & return
            // Check if need additional node
            if (carry > 0) {
                return new ListNode(val, new ListNode(carry));
            } else {
                return new ListNode(val);
            }
        } else {
            ListNode merge = (l1.next == null) ? l2.next : l1.next;
            if (merge.val+carry >= 10) {
                return new ListNode(val,
                        addTwoNumbers(merge, new ListNode(carry)));
            } else {
                merge.val += carry;
                return new ListNode(val, merge);
            }
        }
    }
}
