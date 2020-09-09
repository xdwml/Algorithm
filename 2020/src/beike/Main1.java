package beike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
1
S J J B
2
S J J B
S J J B
3
S J J B
S J J B
S J J B
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        sc.nextLine();
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i <m ; i++) {
            String str=sc.nextLine();
            String[] ss = str.split(" ");
            for (int j = 0; j <ss.length ; j++) {
                list.add(ss[j]);
            }
        }

        String[] srr=new String[4*m];
        for (int i = 0; i < 4*m; i++) srr[i] = list.get(i);

        System.out.println(list);
        System.out.println(Arrays.toString(srr));
        int left=0;
        int right=0;
        for (int i = 0; i <m; i++) {
            left=left+compare(srr[4*i],srr[4*i+2])+compare(srr[4*i],srr[4*i+3]);
            right=right+compare(srr[4*i+1],srr[4*i+2])+compare(srr[4*i+1],srr[4*i+3]);
        }
        if(left>right){
            System.out.println("left");
        }else if(left<right){
            System.out.println("right");
        }else {
            System.out.println("same");
        }
    }
    public static int compare(String s1,String s2){
        int re=0;
        if(s1.equals("S") && s2.equals("J")) {
            re=1;
        }
        if((s1.equals("S") && s2.equals("S"))|| (s1.equals("S") && s2.equals("B"))) {
            re=-1;
        }
        if((s1.equals("J") && s2.equals("S"))|| (s1.equals("J") && s2.equals("J"))) {
            re=-1;
        }
        if(s1.equals("J") && s2.equals("B")) {
            re=1;
        }
        if(s1.equals("B") && s2.equals("J")) {
            re=1;
        }
        if((s1.equals("B") && s2.equals("S"))||(s1.equals("B") && s2.equals("B"))) {
            re=-1;
        }
        return re;
    }

}
