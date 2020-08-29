package 拼多多;
import java.util.Scanner;

/**
 * 给出一串由1到9组成的字符串，找出其中的一段长度为3的区间，这个区间构成的数是最大的。
 * 输入描述：一行字符串，字符串的长度在3到1000之间。
 * 输出描述：最大的数
 * 示例：
 * 输入：12321
 * 输出：321
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        int max=0;
        for (int i = 0; i < result.length()-3; i++) {
            int a=Integer.parseInt(result.substring(i,i+3));
            int b=Integer.parseInt(result.substring(i+1,i+4));
            if(a>b){
                max=a;
            }else {
                max=b;
            }
        }
        System.out.println(max);
    }
}
