package Top100;

import org.junit.Test;

import java.util.Arrays;

public class twoSum1 {
    //有序数组求和
    public int[] twoSum(int[] arr,int target){
        if(arr==null || arr.length<2){
            return null;
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                return new int[]{start,end};
            }else if(sum<target){
                start++;
            }else {
                end--;
            }
        }
        return null;
    }
    @Test
    public void test(){
        int [] arr={2,7,11,15};
        int [] res=twoSum(arr,13);
        System.out.println(Arrays.toString(res));
    }
}
