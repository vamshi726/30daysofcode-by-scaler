//Problem: Intersection of Two Linked Lists

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode copyA = headA;
    ListNode copyB = headB;
    while (copyA != copyB) {
      copyA = copyA == null ? headB : copyA.next;
      copyB = copyB == null ? headA : copyB.next;
    }
    return copyA;
    }
}

/*
[4,1,8,4,5]
[5,6,1,8,4,5] 2 3
Output:
Intersected at '8'
*/

