class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates,target,0,ll,list);
        return list;
    }
    public void helper(int [] arr, int amount, int idx, List<Integer> ll, List<List<Integer>> list){
        
        if(amount == 0){
            list.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(amount >= arr[i]){
            ll.add(arr[i]);
            helper(arr,amount-arr[i],i,ll,list);
            ll.remove(ll.size()-1);
            }
        }
    }
}