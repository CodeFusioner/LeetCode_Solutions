class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,res,"",0,0);
        return res;
    }
    public void helper(int n, List<String> res, String str, int close, int open){
        if(str.length() == n*2){
            res.add(str);
            return;
        }
        if(open < n){
            helper(n,res,str+"(",close,open+1);
        }
        if(close < open){
            helper(n,res,str+")",close+1,open);
        }
    }
}