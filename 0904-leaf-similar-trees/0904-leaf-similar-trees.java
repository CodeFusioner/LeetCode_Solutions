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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ll1 = new ArrayList<>();
        List<Integer> ll2 = new ArrayList<>();
        helper(root1 , ll1);
        helper(root2 , ll2);

        if(ll1.size()!= ll2.size()){
            return false;
        }
        return ll1.equals(ll2);
    }
    public void helper(TreeNode root , List<Integer> ll){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ll.add(root.val);
        }
        helper(root.left , ll);
        helper(root.right , ll);
    }
}