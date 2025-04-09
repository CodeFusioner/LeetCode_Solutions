class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentString = "";
                currentNum = 0;
            } else if (ch == ']') {
                int num = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int i = 0; i < num; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();
            } else {
                currentString += ch;
            }
        }

        return currentString;
    }
}