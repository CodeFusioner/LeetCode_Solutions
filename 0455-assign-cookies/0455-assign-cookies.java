class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // return no. of chilrens satisfy
        Arrays.sort(g); 
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        while( i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++; // move to the next children
            }
            j++; // move to the new cookie
        }
        return i;

    }
}