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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll = new ArrayList<>();
        helper(root,"",ll);
        return ll;
    }
    public void helper(TreeNode root, String path, List<String> ll){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ll.add(path+root.val);
        }
        helper(root.left,path+root.val+"->",ll);
        helper(root.right,path+root.val+"->",ll);
    }
}