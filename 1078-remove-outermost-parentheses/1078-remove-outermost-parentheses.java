class Solution {
    public String removeOuterParentheses(String s) {
        int open  =1;
        int close = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' ){
                open++;
            }else if(ch == ')'){
                close++;
            }
            st.push(ch);
            if(open == close){
                open = 1;
                close = 0;
                i++;
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}