package 牛客标准输入;
import java.util.Scanner;
public class Main5 {
    //输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
    //接下来t行, 每行一组数据。
    //每行的第一个整数为整数的个数n(1 <= n <= 100)。
    //接下来n个正整数, 即需要求和的每个正整数。
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=0;i<c;i++){
            int n=sc.nextInt();
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