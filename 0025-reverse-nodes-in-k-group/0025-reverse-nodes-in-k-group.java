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
        Stack<ListNode> st = new Stack<ListNode>();
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode curr = head;
        while(curr!=null){
            st.push(curr);
            curr = curr.next;
            if(st.size() == k){
                while(!st.isEmpty()){
                    temp.next = st.pop();
                    temp = temp.next;
                }
                 head = curr;
            }
        }
        temp.next = null;
        if(st.size()>0){
            temp.next = head;
        }
        return dummy.next;
    }
}