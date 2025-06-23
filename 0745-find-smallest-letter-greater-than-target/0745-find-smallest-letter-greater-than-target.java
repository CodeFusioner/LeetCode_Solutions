class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        int idx = 0;
        for(int i=0;i<letters.length;i++){
            char ch = letters[i];
            if(ch > target){
                idx = i;
                break;
            }
        }
        System.out.println(letters);
        return letters[idx];
    }
}