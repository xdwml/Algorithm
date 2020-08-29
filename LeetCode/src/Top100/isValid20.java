package Top100;

import org.junit.Test;

import java.util.Stack;
//有效的括号
public class isValid20 {
    public boolean isValid(String s) {
        if (s.length()==0) return true;
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (!stack.empty()) {
                char c = stack.peek();
                if ((c == '(' && s.charAt(i) == ')' )
                        || (c == '{' && s.charAt(i) == '}')
                        || (c == '[' && s.charAt(i) == ']')){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
    @Test
    public void test(){
        System.out.println("()是否有效："+isValid("()"));
        System.out.println("()[]{}是否有效："+isValid("()[]{}"));
        System.out.println("{()}是否有效："+isValid("{()}"));
        System.out.println("([)}是否有效："+isValid("([)}"));
        System.out.println("([)是否有效："+isValid("([)"));
    }
}
