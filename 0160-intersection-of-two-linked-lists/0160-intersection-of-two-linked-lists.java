/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0, size2 = 0;
        ListNode head1 = headA, head2 = headB;

        while (head1 != null) {
            size1++;
            head1 = head1.next;
        }

        while (head2 != null) {
            size2++;
            head2 = head2.next;
        }

        head1 = headA;
        head2 = headB;

        int diff = Math.abs(size1 - size2);

        if (size1 > size2) {
            for (int i = 0; i < diff; i++) head1 = head1.next;
        } else {
            for (int i = 0; i < diff; i++) head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }
}