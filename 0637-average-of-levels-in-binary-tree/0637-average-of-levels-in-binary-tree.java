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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ll = new ArrayList<>();
        traversal(root, ll);
        return ll;
    }
    public void traversal(TreeNode root, List<Double> ll) {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            double ans = 0;
            double size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode nn = q.poll();
                ans += nn.val;
                if (nn.left != null) {
                    q.add(nn.left);
                }
                if (nn.right != null) {
                    q.add(nn.right);
                }
            }
            ll.add(ans/size);
        }
    }
}