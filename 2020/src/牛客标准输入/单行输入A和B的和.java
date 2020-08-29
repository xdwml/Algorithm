package 牛客标准输入;
//计算a+b
import java.util.Scanner;
public class 单行输入A和B的和 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}

