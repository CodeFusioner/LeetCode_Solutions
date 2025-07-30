class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ll=new ArrayList<>();
       Arrays.sort(candidates); 
       sum(ll,target,new ArrayList<>(),0,candidates);
       return ll;
    }
    public static void sum(List<List<Integer>> ll,int target,List<Integer> ll1,int idx,int[] arr ){
        if(target==0){ 
            // if(!ll.contains(ll1))
            ll.add(new ArrayList<>(ll1));
            return;
        }
        if(target<0||idx>=arr.length) return;
          for(int i=idx;i<arr.length;i++){
             if(i>0&&i>idx&&arr[i]==arr[i-1]) continue;
            if(target-arr[i]>=0) {
                ll1.add(arr[i]);
                sum(ll,target-arr[i],ll1,i+1,arr);
                ll1.remove(ll1.size()-1);
                
            }
          }
          
        
    }
}