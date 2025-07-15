class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int vowelCount = 0;
        int consoCount = 0;
        boolean flag = false;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
                flag = true;
            }else{
                return false;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  ){
                vowelCount++;
            }
            if (((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) && vowels.indexOf(ch) == -1) {
                consoCount++;
            }
        }
        if(flag && vowelCount >0 && consoCount > 0) return true;
        return false;
    }
}