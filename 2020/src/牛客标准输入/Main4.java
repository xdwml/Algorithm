package 牛客标准输入;

import java.util.Scanner;
public class Main4 {
    //输入数据包括多组。
    //每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
    //接下来n个正整数,即需要求和的每个正整数。
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;;i++){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int sum=0;
            while(n>0){
                int a=sc.nextInt();
                sum+=a;
                n--;

            }
            System.out.println(sum);
        }
    }
}