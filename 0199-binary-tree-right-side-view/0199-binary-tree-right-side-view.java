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
    int visited  = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        view(root,0,ll);
        return ll;
    }
    public void view(TreeNode root, int curr, List<Integer>ll){
        if(root == null){
            return;
        }
        if(curr > visited){
            ll.add(root.val);
            visited++;
        }
        view(root.right,curr+1,ll);
        view(root.left,curr+1,ll);
    }
}