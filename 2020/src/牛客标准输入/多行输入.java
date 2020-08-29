package 牛客标准输入;

import java.util.Scanner;
public class 多行输入 {
    //输入第一行包括一个数据组数t(1 <= t <= 100)
    //接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(b+c);
        }
    }

    //输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据有多组, 如果输入为0 0则结束输入
    public static void main2(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0 && b==0){
                break;
            }else{
                System.out.println(a+b);
            }

        }
    }

}




