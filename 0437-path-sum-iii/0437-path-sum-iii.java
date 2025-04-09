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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        Sum(root , targetSum);
        pathSum(root.left , targetSum);
        pathSum(root.right , targetSum);
        return count;
    }
    public void Sum(TreeNode root , long targetSum){
        if(root == null){
            return;
        }
        if(root.val - targetSum == 0){
            count++;
        }
        Sum(root.left , targetSum - root.val);
        Sum(root.right , targetSum - root.val);
    }
}
