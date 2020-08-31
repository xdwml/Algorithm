package ReDo;

public class T8_JumpFloor {
    //方法1：递归
    public int JumpFloor(int target) {
        int sum = 0;
        if(target==0 || target==1){
            return 1;
        }else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }

    }
    //方法2：背包
    public int JumpFloor2(int target) {

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
