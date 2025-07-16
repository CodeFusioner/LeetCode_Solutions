class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String [] arr = s.split("\\s+");
        int low = 0, high = arr.length-1;
        while(low<high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(String str : arr){
            sb.append(str+" ");
        }
        return sb.toString().trim();
    }
}