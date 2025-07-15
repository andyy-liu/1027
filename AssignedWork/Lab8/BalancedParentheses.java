import java.util.Stack;

public class BalancedParentheses {
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!isMatchingPair(open, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println("Expression 1: " + expression1 + " is balanced: " + areParenthesesBalanced(expression1));
        System.out.println("Expression 2: " + expression2 + " is balanced: " + areParenthesesBalanced(expression2));
        System.out.println("Expression 3: " + expression3 + " is balanced: " + areParenthesesBalanced(expression3));
    }
}