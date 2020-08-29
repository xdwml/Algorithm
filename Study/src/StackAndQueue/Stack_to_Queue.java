package StackAndQueue;

import java.util.Stack;

public class Stack_to_Queue {
    public static class StackQueue{
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;
        public StackQueue(){
            stackPush =new Stack<Integer>();
            stackPop =new Stack<Integer>();
        }
        public void add(int num){
            stackPush.push(num);
        }
        public Integer poll(){
            if(stackPop.isEmpty() && stackPush.isEmpty()){
                System.out.println("抛出异常");
            }else if(stackPop.isEmpty()){  //要一下子把栈里的数据倒进去完
                while(!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }
        public Integer peek(){
            if(stackPop.isEmpty() && stackPush.isEmpty()){
                System.out.println("空");
            }else if(stackPop.isEmpty()){
                while(!stackPush.isEmpty()){
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }
    public static void main(String[] args) {
        System.out.println("======两个栈实现一个队列：先进先出=======");
        StackQueue queue = new StackQueue();
        queue.add(3);//3
        queue.add(1);//13
        queue.add(5);//513
        System.out.println("队头："+queue.peek());//3
        System.out.println("弹出："+queue.poll());//弹出3
        queue.add(6);//651
        System.out.println("弹出："+queue.poll());//弹出1
        System.out.println("队头："+queue.peek());//5
        System.out.println("弹出："+queue.poll());//弹出5
        System.out.println("弹出："+queue.poll());//弹出6
    }
}
