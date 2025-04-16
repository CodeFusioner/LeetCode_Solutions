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
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        helper(root,ll,0);
        int sum = 0;
        for(int i: ll){
            sum += i;
        }
        return sum;
    }
    public void helper(TreeNode root, List<Integer> ll, int f){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(f == 1){
                ll.add(root.val);
            }
        }
        helper(root.left,ll,1);
        helper(root.right,ll,0);
    }
}