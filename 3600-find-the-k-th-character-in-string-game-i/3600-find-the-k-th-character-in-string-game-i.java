class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                sb.append((char) ((c - 'a' + 1) % 26 + 'a'));
            }
            word.append(sb);
        }
        return word.charAt(k - 1);
    }
}