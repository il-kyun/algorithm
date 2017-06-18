package com.leetcode;

/**
 * Created by IK on 2017-06-18.
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode head = node;

        while (l1 != null || l2 != null || carry != 0) {
            carry += l1 == null ? 0 : l1.val;
            carry += l2 == null ? 0 : l2.val;
            node.next = new ListNode(carry % 10);
            carry /= 10;
            node = node.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return head.next;
    }
}