class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> ll = new HashSet<>();
        List<Integer> idx = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                idx.add(i);
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j: idx){
               int diff = Math.abs(i-j);
                if(diff <= k){
                    ll.add(i);
               }
            }
            
        }
        List<Integer> ans = new ArrayList<>(ll);
        Collections.sort(ans);
        return ans;
    }
}