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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(100);
        ListNode odd = new ListNode(100);
        ListNode evenDummy = even;
        ListNode oddDummy = odd;
        ListNode dummy = head;
        int size=0;
        while(dummy != null){
            size++;
            dummy = dummy.next;
        }
        dummy = head;
        for(int i =1;i<=size;i++){
            if((i%2) == 0){
                evenDummy.next = new ListNode(dummy.val);
                dummy = dummy.next;
                evenDummy = evenDummy.next;
            }else{
                oddDummy.next = new ListNode(dummy.val);
                dummy = dummy.next;
                oddDummy = oddDummy.next;
            }
        }
        oddDummy.next = even.next;
        return odd.next;
    }
}