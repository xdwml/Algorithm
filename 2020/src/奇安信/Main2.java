package 奇安信;

import org.junit.Test;

import java.util.Arrays;

public class Main2 {
    public static int count=0;
    public int reletive_7 (int[] digit) {
        // write code here

        if(digit==null){
            return 0;
        }
        if(digit.length==1 && digit[0]%7==0){
            return 1;
        }
        findNums(digit,0,digit.length);

        return count;
    }
    public void findNums(int[] nums,int start,int len){

        if(start==len){

            String str="";
            for (int i = 0; i <len ; i++) {
                str+=nums[i];
            }
            if (Integer.parseInt(str)%7==0){
                count++;
            }
        }else {
            for (int i = start; i <len ; i++) {
                swap(nums,start,i);
                findNums(nums,start+1,len);
                swap(nums,start,i);
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }
    @Test
    public void test(){
        int [] arr={1,1,2};

        System.out.println(reletive_7 (arr));
    }


}
