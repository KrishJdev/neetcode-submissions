class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty())
                return false;
                char top = stack.peek();
                if (top == '(' && c == ')') {
                    stack.pop();
                } else if (top == '[' && c == ']') {
                    stack.pop();
                } else if (top == '{' && c == '}') {
                    stack.pop();
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}