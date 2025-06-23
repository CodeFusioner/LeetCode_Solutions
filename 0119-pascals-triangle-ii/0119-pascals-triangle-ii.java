class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> res = new ArrayList<>();
            for(int j= 0;j<=i;j++){
                if(j==0||j==i){
                    res.add(1);
                }else{
                    res.add(ll.get(i-1).get(j-1) + ll.get(i-1).get(j) );
                }
            }
            ll.add(res);
        }
        return ll.get(rowIndex);
    }
}

