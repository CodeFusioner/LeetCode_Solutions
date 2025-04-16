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
    public int findSecondMinimumValue(TreeNode root) {
       Set<Integer> set = new HashSet<>();
       Set(root , set);
       int [] ans = new int[set.size()];
       int i = 0;
       for(int j : set){
        ans[i] = j;
        i++;
       }
       Arrays.sort(ans);
       if(ans.length == 1){
        return -1;
       }
        return ans[1];
    }
    public void Set(TreeNode root ,Set<Integer> set){
        if(root == null){
            return;
        }
        Set(root.left , set);
        set.add(root.val);
        Set(root.right , set);
    }
}