class Solution {
    public String longestCommonPrefix(String[] strs) {
        // ek ek character kam krte jayenge if indexOf(prefix) != 0
        // if == 0 then it means it is present in strs[i];
        if(strs.length == 0 || strs == null){
            return "";
        }
        String prefix = strs[0];// let flower as a prefix
        for(int i = 1;i<strs.length;i++){ // start with the flow
            while(strs[i].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0 , prefix.length() -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}