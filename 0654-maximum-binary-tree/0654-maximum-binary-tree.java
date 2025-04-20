/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0 , nums.length-1 , nums);        
    }
    public int findIdx(int [] nums, int l , int r){
       int maxIdx = l;
       int max = nums[l];
       for(int i = l+1;i<=r;i++){
        if(max<nums[i]){
            max = nums[i];
            maxIdx = i;
        }
       }
       return maxIdx;
    }
    public TreeNode helper(int l, int r , int [] nums){
        if(l>r){
            return null;
        }
        int maxIdx = findIdx(nums , l ,r);
        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = helper(l , maxIdx-1 , nums);
        root.right = helper(maxIdx+1 , r , nums);
        return root;
    }
}