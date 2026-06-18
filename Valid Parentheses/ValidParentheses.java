import java.util.HashMap;
import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty() || map.get(stack.pop()) != ch)
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{}"));
    }
}
/*
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        return isValid(0, ' ', s.toCharArray()) > 0;
    } 
    private int isValid(int i, char last, char[] s) {
        if(i == s.length) return i;
        if(i > s.length) return - 1;
        if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
            int next = isValid(i + 1, s[i], s);
            if(next < 0) return -1;
            else return isValid(next + 1, last, s);
        }
        if(last == '(' && s[i] == ')' || last == '[' && s[i] == ']' || last == '{' && s[i] == '}') return i;
        return -1;
    }
}
*/