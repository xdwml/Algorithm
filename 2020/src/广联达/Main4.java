package 广联达;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int a = 0; a <n ; a++) {
            System.out.print(arr[a]+" ");
        }
        PriorityQueue<Integer> que=new PriorityQueue<Integer>((Integer a,Integer b)->(a-b));
        LinkedList<Integer> res=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            que.add(arr[i]);
        }
        int num1=0;
        int num2=0;
        while (que.size()>1){
            num1=que.poll();
            num2=que.poll();
            if(num1==num2){
                que.add(num1+num2);
            }else {
                res.addFirst(num1);
                que.add(num2);
            }
        }
        if(!que.isEmpty()){
            res.addFirst(que.poll());
        }
        int[] r=new int[res.size()];

        for (int b = 0; b <r.length ; b++) {
            r[b]=res.get(b);
        }
        System.out.println();
        for (int j = 0; j <r.length ; j++) {
            System.out.print(r[j]+" ");
        }
    }
}
