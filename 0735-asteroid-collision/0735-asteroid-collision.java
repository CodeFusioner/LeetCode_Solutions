class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                } 
                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }else if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                }
            }
        }
        int [] ans = new int[st.size()];
        for(int i = 0;i<st.size();i++){
            ans[i] = st.get(i);
        }
        return ans;
    }
}