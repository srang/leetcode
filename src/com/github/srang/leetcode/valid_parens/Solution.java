package com.github.srang.leetcode.valid_parens;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> parenStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(': case '{': case '[':
                    parenStack.push(c);
                    break;
                case ')':
                    if (!parenStack.empty() && parenStack.peek() == '(') {
                        parenStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!parenStack.empty() && parenStack.peek() == '{') {
                        parenStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!parenStack.empty() && parenStack.peek() == '[') {
                        parenStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return parenStack.empty();
    }
}
