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
        int [] arr = new int[st.size()];
        int j = 0;
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        while(!st2.isEmpty()){
            arr[j++] = st2.pop();
        }

        return arr;
    }
}