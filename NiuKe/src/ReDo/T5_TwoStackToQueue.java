package ReDo;

import org.junit.Test;

import java.util.Stack;

public class T5_TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();//入栈
    Stack<Integer> stack2 = new Stack<Integer>();//出栈
    public void push(int node) {
        stack1.push(node);//入队列压入入栈
    }
    public int pop() throws Exception {
        //若出栈为空，将入栈元素一次性压入出栈，再弹出出栈的元素，否则直接弹出出栈栈顶
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }

}
