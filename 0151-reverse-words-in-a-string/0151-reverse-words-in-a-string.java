class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String [] arr = str.split("\\s+");
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
        String result = "";
        for(int k = 0;k<arr.length;k++){
            result += arr[k] + " ";
        }
         return result.trim();
    }
}