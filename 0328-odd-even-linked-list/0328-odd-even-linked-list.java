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
        ListNode odd = new ListNode(100);
        ListNode even = new ListNode(100);
        ListNode currOdd = odd;
        ListNode currEven = even;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        temp = head;
        for(int i=0;i<len;i++){
            if(i % 2 == 0){
                currEven.next = new ListNode(temp.val);
                currEven = currEven.next;
            }else{
                currOdd.next = new ListNode(temp.val);
                currOdd = currOdd.next;
            }
            temp = temp.next;
        }
        currEven.next = odd.next;
        return even.next;
    }
}