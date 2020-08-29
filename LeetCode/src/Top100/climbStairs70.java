package Top100;

import org.junit.Test;

public class climbStairs70 {
    //方法1：递归法
    /*public int climbStairs(int n){
        if(n<=2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }*/
    //方法2：记忆递归法
    /*public int climbStairs(int n){
        int [] memo=new int[n+1];
        return climbStairsMemo(n,memo);//存储计算结果，避免重复计算
    }
    public int climbStairsMemo(int n,int[] memo){
        //如果该值已计算过，直接返回数组中的值
        if(memo[n]>0){
            return memo[n];
        }
        if(n==1){
            memo[n]=1;
        }else if(n==2){
            memo[n]=2;
        }else{
            memo[n]=climbStairsMemo(n-1,memo)+climbStairsMemo(n-2,memo);
        }
        return memo[n];
    }*/
    //方法3：动态规划
    public int climbStairs(int n){
        //如果只要一个，直接判读
        if(n==1){
            return 1;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    @Test
    public void test(){
        System.out.println(climbStairs(10));
    }
}
