class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        List<String> list = Arrays.asList(words);
        Collections.reverse(list);
        String ans =  String.join(" ", list);
        return ans.trim();

    }
}