package 电信;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(result(n));
    }
    public static int result(int n){
        Queue<Long> queue=new PriorityQueue<Long>();
        int count=0;
        long result =1;
        queue.add(result);
        while (count<n) {
            result=queue.poll();
            while(!queue.isEmpty() && result==queue.peek()){
                queue.poll();
            }
            count++;
            queue.offer(result*2);
            queue.offer(result*3);
            queue.offer(result*5);
        }
        return (int)result;
    }
}
