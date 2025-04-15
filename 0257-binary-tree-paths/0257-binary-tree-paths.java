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
    List<String> ll = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return ll;
    }
    public void helper(TreeNode root, String path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ll.add(path+root.val);
        }
        helper(root.left,path+root.val+"->");
        helper(root.right,path+root.val+"->");
    }
}