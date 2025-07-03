class Solution {
    public int[] diStringMatch(String s) {
        int [] arr = new int[s.length()+1];
        int left = 0;
        int right = s.length();
        int j = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'I'){
                arr[j] = left;
                j++;
                left++;
            }else{
                arr[j] = right;
                j++;
                right--;
            }
        }
        if(s.charAt(s.length()-1) == 'I'){
            arr[j++] = left;
        }else{
            arr[j++] = right;
        }

        return arr;
    }
}