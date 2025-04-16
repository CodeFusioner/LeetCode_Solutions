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
    List<Integer> ll = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(ll.contains(k-root.val)){
            return true;
        }
        ll.add(root.val);
        boolean l = findTarget(root.left,k);
        boolean r = findTarget(root.right,k);
        return l || r;
    }

    
}