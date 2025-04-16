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
    public class diapair{
        int ht = 0;
        int dt = 0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).dt;
    }
    public diapair helper(TreeNode root){
        if(root == null){
            return new diapair();
        }
        diapair ld = helper(root.left);
        diapair rd = helper(root.right);
        int sd = ld.ht + rd.ht;
        diapair sdp = new diapair();
        sdp.ht = Math.max(ld.ht,rd.ht)+1;
        sdp.dt = Math.max(ld.dt, Math.max(sd,rd.dt));
        return sdp;
    }
}