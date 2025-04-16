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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        convertIntoList(root, ll);
        System.out.println(ll);
        if(ll.size() <= 1) return ll.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ll.size();i++){
            for(int j=0;j<ll.size();j++){
                if(i != j){
                    int diff = Math.abs(ll.get(i) - ll.get(j));
                    min = Math.min(diff,min);
                }
            }
        }

        return min;
    }
    public void convertIntoList(TreeNode root, List<Integer> ll){
        if(root == null) return;
        // inorder -> left root right
        convertIntoList(root.left, ll);
        ll.add(root.val);
        convertIntoList(root.right, ll);
    }
}