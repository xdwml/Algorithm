package StackAndQueue;

public class Array_to_Stack {

    public static class ArrayStack{
        private Integer[] arr;
        private Integer size;
        public ArrayStack(int initsize){
            if(initsize<0){
                System.out.println("数组长度小于0");
            }
            arr=new Integer[initsize];
            size=0;
        }
        //返回栈顶
        public Integer peek() {
            if(size==0){
                return null;
            }
            return arr[size-1];

        }
        //压栈
        public Integer push(int o){
            if(size==arr.length){
                System.out.println("此栈已满");
            }
            return arr[size++]=o;
        }
        //弹栈
        public Integer pop(){
            if(size==0){
                System.out.println("此栈为空");
            }
            return arr[--size];
        }
    }
    public static void main(String[] args) {

    }

}
