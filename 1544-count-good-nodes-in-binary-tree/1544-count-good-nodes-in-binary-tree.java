class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        int root_val=root.val;
        helper(root,root_val);
        return count;
    }
    private void helper(TreeNode root,int max){
        if(root!=null){
            if(max<=root.val){
                max=root.val;
                count++;
            }
            helper(root.right,max);
            helper(root.left,max);
        }
        
        
    }
}