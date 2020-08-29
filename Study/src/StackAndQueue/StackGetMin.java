package StackAndQueue;

import java.util.Stack;

public class StackGetMin {
    public static class GetMinStack{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;
        //初始化
        public GetMinStack(){
            this.stackData=new Stack<Integer>();
            this.stackMin=new Stack<Integer>();
        }
        //压栈
        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if(newNum<this.stackMin.peek()){
                this.stackMin.push(newNum);
            }else{
                this.stackMin.push(this.stackMin.peek());
            }
            this.stackData.push(newNum);
        }
        //弹栈
        public int pop(){
            if(this.stackData.isEmpty()){
                System.out.println("此栈为空");
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }
        //获得最小值
        public int getmin(){
            if(this.stackMin.isEmpty()){
                System.out.println("此栈为空");
            }
            return this.stackMin.peek();
        }
    }
    public static void main(String[] args) {
        System.out.println("=============");
        GetMinStack stack1 = new GetMinStack();
        stack1.push(3);
        System.out.println("最小值："+stack1.getmin());//最小值3
        stack1.push(1);
        System.out.println("最小值："+stack1.getmin());//最小值4
        stack1.push(5);
        System.out.println("最小值："+stack1.getmin());//最小值1
        System.out.println("弹出："+stack1.pop());//弹出1
        System.out.println("最小值："+stack1.getmin());//最小值3
        System.out.println("弹出："+stack1.pop());//弹出4
        System.out.println("最小值："+stack1.getmin());//最小值3

    }



}
