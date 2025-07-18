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
        ListNode currA = headA;
        ListNode currB = headB;
        int lenA = 0;
        int lenB = 0;
        while(currA != null){
            lenA++;
            currA = currA.next;
        }
        while(currB != null){
            lenB++;
            currB = currB.next;
        }
        int extra = 0;
        if(lenA < lenB){
            extra = lenB - lenA;
        }else{
            extra = lenA - lenB;
        }
        currA = headA;
        currB = headB;
        if(lenA < lenB){
            for(int i=0;i<extra;i++){
                currB = currB.next;
            }
        }else{
            for(int i=0;i<extra;i++){
                currA = currA.next;
            }
        }
        while(currA != currB){
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}