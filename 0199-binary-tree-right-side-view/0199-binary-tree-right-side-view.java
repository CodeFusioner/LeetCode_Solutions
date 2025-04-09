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
    int visited = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightview(root , 0 , ans);
        return ans;
    }
    public void rightview(TreeNode root , int curr , List<Integer> ans){
        if(root == null){
            return;
        }
        if(curr > visited ){
            ans.add(root.val);
                visited++;
        }
        rightview(root.right , curr+1 , ans);
        rightview(root.left , curr+1 , ans);

    }
}
