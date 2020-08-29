package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_to_Stack {
    public static class QueueStack{
        private Queue<Integer> data;
        private Queue<Integer> help;
        public QueueStack(){
            data=new LinkedList<>();
            help=new LinkedList<>();

        }
        public void push(int num){
            data.add(num);

        }
        public Integer pop(){
            if(data.isEmpty()){
                System.out.println("空");
            }
            while(data.size()>1){
                help.add(data.poll());
            }
            int res=data.poll();
            swap();//交换
            return res;
        }
        public Integer peek(){
            if(data.isEmpty()){
                System.out.println("空");
            }
            while(data.size()>1){
                help.add(data.poll());
            }
            int res=data.poll();
            help.add(res);
            swap();//交换
            return res;
        }
        //改变两个队列的引用
        private void swap(){
            Queue<Integer> tem=help;
            help=data;
            data=tem;
        }

    }

    public static void main(String[] args) {
        System.out.println("======两个队列实现一个栈：先进后出=======");
        QueueStack stack = new QueueStack();
        stack.push(3);//3
        stack.push(1);//13
        stack.push(5);//513

        System.out.println("弹出："+stack.pop());//弹出5
        System.out.println("弹出："+stack.pop());//弹出1
        System.out.println("栈顶："+stack.peek());//3
        System.out.println("弹出："+stack.pop());//弹出3

    }
}
