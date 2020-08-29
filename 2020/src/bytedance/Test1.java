package bytedance;

import java.util.Scanner;

/**
 * 给出一个无序的整数型数组，求不在给定数组里的最小的正整数
 https://blog.csdn.net/qq_37293024/article/details/103291103?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
 */
public class Test1 {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(firstmissingPositive(arr));

    }*/
    public static int firstmissingPositive(int[] nums){
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                    count=1;
            }
            if(count==0)
                return i;
        }
        return n+1;
    }
}
