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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode list = new ListNode(100);
        ListNode res = list;
        List<Integer> ll = new ArrayList<>();
        while(temp!=null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int [] arr = new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i] = ll.get(i);
        }
        reverse(arr,left-1,right-1);
        for(int num: arr){
            res.next = new ListNode(num);
            res = res.next;
        }
        return list.next;
        
    }
    public void reverse(int [] arr, int left, int right){
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}