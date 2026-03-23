package datastructures;

import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch=='('||ch=='{'||ch=='[') {
                characterStack.push(ch);
            } else {
                if (characterStack.isEmpty()) return false;

                char top = characterStack.pop();
                if (ch==')' && top!='(' || ch=='}' && top!='{' || ch==']' && top!='[') {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_20 validParentheses20 = new ValidParentheses_20();
        System.out.println(validParentheses20.isValid("()[]{}"));
    }
}
