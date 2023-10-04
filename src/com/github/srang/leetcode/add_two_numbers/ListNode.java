package com.github.srang.leetcode.add_two_numbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
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