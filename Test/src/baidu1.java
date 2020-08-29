import org.junit.Test;

public class baidu1 {
    public int box(int n){
        if(n<0){
            return 0;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for (int i = 4; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    @Test
    public void test(){
        System.out.println(box(100));
    }
}
