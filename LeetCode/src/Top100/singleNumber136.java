package Top100;

import org.junit.Test;

//136.只出现一次的数字,非空数组某元素只出现一次，其余元素均出现两次
public class singleNumber136 {
    public int singleNumber(int[] nums){
        if(nums.length<2){
            return nums[0];
        }
        int singleNumber=0;
        for (int i = 0; i <nums.length; i++) {
            singleNumber=singleNumber^nums[i];
        }
        return singleNumber;
    }
    @Test
    public void test(){
        int [] arr=new int[]{4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
