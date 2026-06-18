import java.util.Stack;
public class ValidParenthesesStackArray {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty() ){
                    return false;
                }
                char top = stack.peek();
                if ((top == '{' && ch == '}') || (top == '(' && ch == ')') || (top == '[' && ch == ']'))
                    stack.pop();
                else
                    return false;
                
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(new ValidParenthesesStackArray().isValid("{}"));
    }
}
