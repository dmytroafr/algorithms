import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Solution13 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}'){
                if (stack.isEmpty()) return false;
                char prev = stack.pop();

                if ((c == ')' && prev != '(') || 
                    (c == ']' && prev != '[') ||
                    (c == '}' && prev != '{')){
                        return false;
                    }
            }
        }
        return stack.isEmpty();

    }
}