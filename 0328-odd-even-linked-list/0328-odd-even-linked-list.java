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
        ListNode odd = head;
        ListNode even = head;
        ListNode curr = head;
        ListNode list = new ListNode(100);
        ListNode temp = list;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        for(int i=0;i<size;i++){
            if(i%2 == 0){
                temp.next = new ListNode(odd.val);
                temp = temp.next;
            }
            odd = odd.next;
        }
        for(int i=0;i<size;i++){
            if(i%2 != 0){
                temp.next = new ListNode(even.val);
                temp = temp.next;
            }
            even = even.next;
        }
        return list.next;

       
    }
}