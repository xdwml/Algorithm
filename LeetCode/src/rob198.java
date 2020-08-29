import org.junit.Test;

public class rob198 {
    //198.打家劫舍
    public int rob(int[] nums){
        int pre2=0,pre1=0;
        for (int i = 0; i <nums.length ; i++) {
            int cur=Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }

    @Test
    public void test(){
        int[] arr=new int[]{1,2,3,1};
        System.out.println(rob(arr));
    }
}
