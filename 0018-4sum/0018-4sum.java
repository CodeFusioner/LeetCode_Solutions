class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int low = j+1, high = n-1;
                while(low<high){
                    long sum = (long)nums[i] + nums[j] + nums[low] + nums[high];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while(low<high && nums[high] == nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }else if(sum < target ){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return res;
    }
}