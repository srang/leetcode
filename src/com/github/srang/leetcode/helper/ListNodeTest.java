package com.github.srang.leetcode.helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodeTest {
    @Test
    void testListNodeArrayConstruct() {
        ListNode test = new ListNode(new int[]{1, 1, 1, 2, 3, 4});
        assertEquals("[1, 1, 1, 2, 3, 4]", test.toString());
    }

    @Test
    void testListNodeToString() {
        ListNode test = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertEquals("[1, 2, 3]", test.toString());
    }
}
