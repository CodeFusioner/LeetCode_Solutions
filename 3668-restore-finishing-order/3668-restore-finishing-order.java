class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> ll = new ArrayList<>();
        for(int num : friends){
            ll.add(num);
        }
        int [] ans = new int[friends.length];
        int i = 0;
        for(int num : order){
            if(ll.contains(num)){
                ans[i++] = num;
            }
        }
        return ans;
    }
}