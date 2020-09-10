package 电信;

import java.util.Scanner;
/*
1,2,3,4,5
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] split = sc.nextLine().split(",");
        int[] nums=new int[split.length];
        for (int i = 0; i <split.length ; i++) {
            nums[i]=Integer.parseInt(split[i]);
        }
        System.out.println(result(nums));
    }
    public static int result(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i <n ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}
