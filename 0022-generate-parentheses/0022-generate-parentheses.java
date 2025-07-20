class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        print(res,"",n,0,0);
        return res;
    }
    public void print(List<String> res, String ans, int n, int open, int close){
        if(ans.length() == 2*n){
            res.add(ans);
            return;
        }
        if(open<n){
            print(res,ans+"(",n,open+1,close);
        }
        if(close<open){
            print(res,ans+")",n,open,close+1);
        }
    }
}