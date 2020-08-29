import org.junit.Test;
import java.util.Arrays;
public class nextPermutation31 {
    //实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if (i >= 0) {
            int j=nums.length-1;
            while (j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public void reverse(int[] nums,int start){
        int i=start,j=nums.length-1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }
    @Test
    public void test(){
        int[] arr={1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2={3,2,1};
        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3={1,1,5};
        nextPermutation(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] arr4={1,2};
        nextPermutation(arr4);
        System.out.println(Arrays.toString(arr4));
        int[] arr5={1,3,2};
        nextPermutation(arr5);
        System.out.println(Arrays.toString(arr5));
        int[] arr6={2,3,1};
        nextPermutation(arr6);
        System.out.println(Arrays.toString(arr6));
    }

}
