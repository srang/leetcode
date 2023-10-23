package com.github.srang.leetcode.helper;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int[] vals) {
        ListNode x = new ListNode(vals[vals.length-1]);
        for(int i = vals.length-2; i > 0; i--) {
            x = new ListNode(vals[i], x);
        }
        this.val = vals[0];
        this.next = x;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
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