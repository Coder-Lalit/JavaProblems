package LeetCode.Problems.Easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({[)"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.empty()) {
                char top = stack.peek();
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                } else if (c == '}' && top == '{') {
                    stack.pop();
                } else if (c == ']' && top == '[') {
                    stack.pop();
                } else if (c == ')' && top == '(') {
                    stack.pop();
                } else {
                    break;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
