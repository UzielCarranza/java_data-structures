package practiceFolder;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.Function;

public class ValidParenthesis {

//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.

    public static void main(String[] args) {

        Function<String, Boolean> isValidParenthesis = (str) -> {
//            initialize a new stack
            Stack<Character> stack = new Stack<>();

//            iterate over the string given
            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (a == '(' || a == '[' || a == '{') {
                    stack.push(a);
                } else if (stack.empty()) {
                    return false;
                } else if (a == ')' && stack.pop() != '(') {
                    System.out.println(stack.pop());
                    return false;
                } else if (a == ']' && stack.pop() != '[') {
                    return false;
                } else if (a == '}' && stack.pop() != '{') {
                    return false;
                }
            }
            return stack.isEmpty();
        };
        System.out.println(isValidParenthesis.apply("{}"));
    }
}
