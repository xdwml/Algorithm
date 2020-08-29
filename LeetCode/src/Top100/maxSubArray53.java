package Top100;

import org.junit.Test;
//53.最大子序和
public class maxSubArray53 {
    public int maxSubArray(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int max=nums[0];//以第一个为最大
        for (int i = 0; i <nums.length-1 ; i++) {
            int m=nums[i];
            if(nums[i]>max){
                max=nums[i];
            }
            for (int j = i+1; j <nums.length ; j++) {
               if(m+nums[j]>nums[j]){
                   m=m+nums[j];
               }else {
                   m=nums[j];
               }

                if(m>max){
                    max=m;
                }
            }
        }
        return max;
    }
    @Test
    public void test(){
        int [] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

        int [] arr2=new int[]{-2,-1};
        System.out.println(maxSubArray(arr2));

    }
}
