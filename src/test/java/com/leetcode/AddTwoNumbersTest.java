package com.leetcode;

import org.junit.Test;

/**
 * Created by IK on 2017-06-18.
 */
public class AddTwoNumbersTest {

    /**
     * [2,4,3]
     * [5,6,4]
     */
    @Test
    public void addTwoNumberTest() {
        AddTwoNumbers add = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode listNode = add.addTwoNumbers(l1, l2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void addTwoNumberTest1() {
        AddTwoNumbers add = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(1);
        l1.next = new AddTwoNumbers.ListNode(8);


        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(0);


        AddTwoNumbers.ListNode listNode = add.addTwoNumbers(l1, l2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
