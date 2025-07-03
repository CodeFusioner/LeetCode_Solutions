class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> ll = new ArrayList<>();
        ll.add(0);
        ll.add(1);
        for(int i=2;i<=k+1;i++){
            int sum = ll.get(i-1)+ll.get(i-2);
            if(sum <=k){
                ll.add(sum);
            }else{
                ll.add(sum);
                break;
            }
        }
        int idx = ll.size()-1;
        int count = 0;
        while(k>0){
            if(k-ll.get(idx) >= 0){
                k-=ll.get(idx);
                count++;
            }
            idx--;
        }
        return count;
    }
}