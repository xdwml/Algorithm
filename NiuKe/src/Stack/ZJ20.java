package Stack;

import org.junit.Test;

import java.util.Stack;
//包含min函数的栈
public class ZJ20 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        if(stack1.isEmpty()){
            stack1.push(node);
            stack2.push(node);
        }else{
            stack1.push(node);
            int min=node<stack2.peek()?node:stack2.peek();
            stack2.push(min);
        }
    }
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    public int top() {
        return stack1.peek();
    }
    public int min() {
        return stack2.peek();
    }
    @Test
    public void test(){
        push(3);
        System.out.println(min());
        push(4);
        System.out.println(min());
        push(2);
        System.out.println(min());
        push(3);
        System.out.println(min());

    }
}
