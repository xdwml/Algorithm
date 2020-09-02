package 面试题;

import org.junit.Test;

import java.util.Stack;

public class isValidkuohao {
    public boolean isValid(String s) {
        if(s==null|| s.length()<2){
            return false;
        }
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(!stack.empty()){
                char c=stack.peek();
                if((c=='(' && s.charAt(i)==')') || (c=='[' && s.charAt(i)==']') || (c=='{' && s.charAt(i)=='}') ){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
    @Test
    public void test(){
        String str="{[][()]}";
        System.out.println(isValid(str));
    }
}
