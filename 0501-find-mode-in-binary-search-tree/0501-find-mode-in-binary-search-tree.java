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
    public int[] findMode(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        HashSet<Integer> res = new HashSet<>();
        convertList(root,ll);
        int first = ll.get(0);
        if(ll.size() == 1){
            return new int[]{first};
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: ll){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int freq = 0;
        for(int num : map.keySet()){
            if(map.get(num) > freq){
                freq = map.get(num);
            }
        }
        System.out.println(freq);
        for(int num : ll){
            if(map.get(num) == freq){
                res.add(num);
            }
        }
        if(res.size() == 0){
            for(int num: ll){
                res.add(num);
            }
        }
        int[] array = new int[res.size()];
        int j = 0;
        for (int i : res) {
            array[j++] = i;
        }
        return array;
    }
    public void convertList(TreeNode root, List<Integer> ll){
        if(root == null) return;
        ll.add(root.val);
        convertList(root.left,ll);
        convertList(root.right,ll);
    }
}