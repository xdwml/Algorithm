import org.junit.Test;

import java.util.Arrays;

public class nextPermutation31String {
    public void nextPermutation(String str) {
        if(str==null||str.length()<2) return;
        String[] s=str.split("");
        Integer[] a=new Integer[s.length];
        for (int i = 0; i <s.length ; i++) {
            a[i]=Integer.valueOf(s[i]);
        }
        int[] b=new int[a.length];
        for (int i = 0; i <b.length ; i++) {
            b[i]=a[i];
        }
        nextPermutation(b);
    }
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2){
            return;
        }
        boolean flag=true;
        int i=nums.length-1;
        while(flag && i>0){
            if(nums[i]>nums[i-1]){
                int tem=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=tem;
                flag=false;
            }
            i--;
        }
        if(i<0){
            Arrays.sort(nums);
        }
    }
    @Test
    public void test(){
        int[] arr={1,2,3};
        nextPermutation(arr);
        System.out.println("整形数组123:"+Arrays.toString(arr));
        String str="123";
        nextPermutation(str);
        System.out.println("数字字符串123:"+Arrays.toString(arr));
        System.out.println("/**************************************/");
        int[] arr2={3,2,1};
        nextPermutation(arr2);
        System.out.println("整形数组321:"+Arrays.toString(arr2));
        String str2="321";
        nextPermutation(str2);
        System.out.println("数字字符串321:"+Arrays.toString(arr2));
    }

}
