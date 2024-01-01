package com.sthmishra.linkedlist;

import java.util.List;

public class LeetClient {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(pairSum(head));
    }

    public static int pairSum(ListNode head) {
        int length = 0, maxNum = Integer.MIN_VALUE;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        int[] arr = new int[length/2];
        int arrIndex = 0, llIndex = 0;
        temp = head;

        while(llIndex < length) {
            if(llIndex < length/2) {
                arr[arrIndex] = temp.val;
            }
            else {
                int tempIndex = length-llIndex-1;
                arr[tempIndex] += temp.val;
                maxNum = Math.max(arr[tempIndex], maxNum);
            }
            llIndex++;
            arrIndex++;
            temp = temp.next;
        }

        return maxNum;
    }
}
