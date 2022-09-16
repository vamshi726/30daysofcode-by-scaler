//Problem: Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;
    ListNode next = null;
    ListNode curr = head;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/ 

