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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(100);
        ListNode curr = dummy;
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            if(st.size() == k){
                while(!st.isEmpty()){
                    curr.next = new ListNode(st.pop());
                    curr = curr.next;
                }
            }
            temp=temp.next;
        }
        Stack<Integer> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        while(!st1.isEmpty()){
            curr.next = new ListNode(st1.pop());
            curr = curr.next;
        }
        return dummy.next;
    }
}