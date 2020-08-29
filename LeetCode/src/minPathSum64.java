import org.junit.Test;

public class minPathSum64 {
    //矩阵的最小路径和，64
    public int minPathSum(int[][] nums) {
        if(nums.length==0 || nums[0].length==0){
            return 0;
        }
        int m=nums.length,n=nums[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=nums[0][0];
        for (int i = 1; i <m; i++) {
            dp[i][0]=nums[i][0]+dp[i-1][0];
        }
        for (int i = 1; i <n; i++) {
            dp[0][i]=nums[0][i]+dp[0][i-1];
        }
        for (int i = 1; i <m; i++) {
            for (int j = 1; j <n; j++) {
                dp[i][j]=Math.min(dp[i][j-1]+nums[i][j],dp[i-1][j]+nums[i][j]);
            }
        }
        return dp[m-1][n-1];
    }
    @Test
    public void tes(){
        int[][] nums={
                {1,3,1},
                {1,5,1},
                {4,2,1}
                };
        System.out.println(minPathSum(nums));
    }
}
