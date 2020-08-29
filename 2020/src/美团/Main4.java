package 美团;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [] aa=new int [n];
        int [] bb=new int [n];
        for (int i = 0; i <n ; i++) {
            aa[i]=sc.nextInt();
            bb[i]=sc.nextInt();
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));
        System.out.println(Money(n,a,b,aa,bb));
    }
    public static int Money(int n,int a,int b,int [] aa,int [] bb){
        int money=0;
        PriorityQueue pa=new PriorityQueue();
        PriorityQueue pb=new PriorityQueue();
        for (int i = 0; i <n ; i++) {
           if(aa[i]>=bb[i]){
               if(pa.size()<a){
                   pa.add(aa[i]);
               }else {
                   int pe= (int) pa.poll();
                   if(pe<aa[i]){
                       pa.add(aa[i]);
                   }else {
                       pa.add(pe);
                   }
               }
           }else {
               if(pb.size()<b){
                   pb.add(bb[i]);
               }else {
                   int pc= (int) pb.poll();
                   if(pc<bb[i]){
                       pb.add(bb[i]);
                   }else {
                       pb.add(pc);
                   }
               }
           }
        }
        for (int i = 0; i <pa.size() ; i++) {
            int q= (int) pa.poll();
            money=money+q;
        }
        for (int i = 0; i <pb.size() ; i++) {
            int p= (int) pb.poll();
            money=money+p;
        }
        return money;
    }
}
