package StackAndQueue;

import java.net.Inet4Address;

public class Array_to_Queue {
    public static class ArrayQueue{
        private Integer[] arr;
        private Integer size;
        private Integer start;
        private Integer end;
        public ArrayQueue(int initsize){
            if(initsize<0){
                System.out.println("数组长度小于0");
            }
            arr=new Integer[initsize];
            size=0;
            start=0;
            end=0;
        }
        //返回队头
        public Integer peek() {
            if(size==0){
                return null;
            }
            return arr[start];
        }
        //入队
        public Integer add(int o){
            if(size==arr.length){
                System.out.println("此队列已满");
            }
            size++;
            arr[end] = o;
            return end= end == arr.length - 1 ? 0 : end + 1;
        }
        //出队
        public Integer poll(){
            if(size==0){
                System.out.println("此栈为空");
            }
            size--;
            int tmp = start;
            start= start==arr.length-1?0:start+1;
            return arr[tmp];
        }
    }
}
