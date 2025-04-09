class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> st = new Stack<>();
        for(int ast : asteroids){
            boolean exploid = false;
            while(!st.isEmpty()&&ast<0&&st.peek()>0){
                if(st.peek()< -ast){
                    st.pop();
                } else if (st.peek() == -ast) {
                    st.pop();
                    exploid = true;
                    break;
                }else{
                    exploid = true;
                    break;
                }
            }
            if(!exploid){
                st.push(ast);
            }
        }
        int [] ans = new int[st.size()];
        for(int i = 0;i<st.size();i++){
            ans[i] = st.get(i);
        }
        return ans;

    }
}