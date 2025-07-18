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
        Stack<Integer> st = new Stack<>();
        ListNode newNode = new ListNode(100);
        ListNode nn = newNode;
        ListNode temp = head;
        while(temp != null){
            st.push(temp.val);
            if(st.size() == k){
                while(!st.isEmpty()){
                    nn.next = new ListNode(st.pop());
                    nn = nn.next;
                }
            }
            temp = temp.next;
        }
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            nn.next = new ListNode(st2.pop());
            nn = nn.next;
        }
        return newNode.next;
    }
}