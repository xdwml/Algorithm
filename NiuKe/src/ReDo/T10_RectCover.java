package ReDo;

public class T10_RectCover {
    //方法1：递归
    public int RectCover(int target) {
        if (target <= 2){
            return target;
        }

        return RectCover(target-1)+RectCover(target-2); //相对于 n+1 块来说，第 n 种的方法
    }
    //方法2：背包
    public int RectCover2(int target) {
        if(target<1){
            return 0;
        }
        int dp[]=new int[2];
        dp[0]=1;
        dp[1]=2;
        if(target<3){
            return dp[target-1];
        }
        for(int i=3;i<=target;i++){
            int temp=dp[1]+dp[0];
            dp[0]=dp[1];
            dp[1]=temp;
        }
        return dp[1];
    }

}
