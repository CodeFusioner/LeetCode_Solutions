class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int open = 1, close = 0;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                close++;
            }
            st.push(ch);
            if(open == close){
                st.pop();
                open = 1;
                close = 0;
                i=i+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}