package com.github.srang.leetcode.merge_two_sorted_lists;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int[] vals) {
        ListNode x = new ListNode(vals[vals.length]);
        for(int i = vals.length-1; i > 0; i--) {
            x = new ListNode(vals[i], x);
        }
        this.val = vals[0];
        this.next = x;
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public String toString(){
        StringBuilder strb = new StringBuilder();
        ListNode cur = this;
        strb.append("[").append(cur.val);
        while(cur.next != null) {
            cur = cur.next;
            strb.append(", ").append(cur.val);
        }
        return strb.append("]").toString();
    }
}