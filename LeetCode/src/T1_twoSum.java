import org.junit.Test;

import java.util.Arrays;

public class T1_twoSum {
    //如果方法无序，要使用方法1：暴力
    //如果数组有序，可使用方法2：首尾指针法
    public int[] twoSum(int[] nums, int target) {
        int [] res=new int[2];
        if(nums==null||nums.length<2){
            return null;
        }

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]+nums[end]==target){
                res[0]=start;
                res[1]=end;
                break;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else{
                start++;
            }
        }
        return res;
    }

    @Test
    public void test(){
        int [] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
