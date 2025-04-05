/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> ll = new ArrayList<>();
        ListNode dummy = head;
        while(dummy != null){
            ll.add(dummy.val);
            dummy = dummy.next;
        }
        Collections.sort(ll);
        System.out.println(ll);
        ListNode headB = new ListNode(0);
        ListNode temp = headB;
        for(int i : ll){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return headB.next;
    }
}