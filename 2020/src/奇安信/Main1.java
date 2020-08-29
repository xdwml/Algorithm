package 奇安信;
import java.util.Scanner;

/**
 * 购买商品的最大使用价值问题
 * 第一行输入预算钱数
 * 第二行输入商品个数
 * 后面几行输入每个商品的购买价值和使用价值
 * 输出在预算下能够买到的商品的最大使用价值
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budgetmoney=sc.nextInt();

        int n = sc.nextInt();
        int[] price=new int[n+1];
        int[] useprice=new int[n+1];
        price[0]=0;
        useprice[0]=0;
        for(int i = 1;i<n+1; i++){
            price[i]=sc.nextInt();
            useprice[i]=sc.nextInt();
        }
        int[] dp=new int[budgetmoney+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 0 ; j <=budgetmoney; j++) {
               if(j>=price[i]){
                   dp[j]=Math.max(dp[j],dp[j-price[i]]+useprice[i]);
               }
            }
        }
        System.out.println(dp[budgetmoney]);
    }

}
