package 牛客标准输入;

import java.util.Scanner;
public class Main6 {
    //输入数据有多组, 每行表示一组输入数据。
    //每行的第一个整数为整数的个数n(1 <= n <= 100)。
    //接下来n个正整数, 即需要求和的每个正整数。
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}

