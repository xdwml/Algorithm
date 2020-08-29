package 牛客标准输入;

import java.util.Scanner;

public class Main7 {
    //输入数据有多组, 每行表示一组输入数据。
    //每行不定有n个整数，空格隔开。(1 <= n <= 100)。
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            String[] str=s.split(" ");
            int len=str.length;
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=Integer.parseInt(str[i]);
            }
            System.out.println(sum);
        }
    }
}
