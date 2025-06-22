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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(100);
        ListNode curr = dummy;
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            if(st.size() == 2){
                curr.next = new ListNode(st.pop());
                curr = curr.next;
                curr.next = new ListNode(st.pop());
                curr = curr.next;
            }
            temp=temp.next;
        }
        while(!st.isEmpty()){
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }
        return dummy.next;
    }
}