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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode newNode = new ListNode(100);
        ListNode nn = newNode;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        k = k%len;
        if(len == k) return head;
        int idx = len - k;
        temp = head;
        for(int i = 0;i<idx;i++){
            temp = temp.next;
        }
        while(temp != null){
            nn.next = new ListNode(temp.val);
            nn = nn.next;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0;i<idx;i++){
            nn.next = new ListNode(temp.val);
            nn = nn.next;
            temp = temp.next;
        }
        return newNode.next;
    }
}