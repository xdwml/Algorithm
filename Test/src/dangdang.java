import org.junit.Test;
public class dangdang {
    public int maxSubArray(int[] nums,int target) {
        int count=0;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum[i] = sum[i - 1] + nums[i];
        for (int start = 0; start < nums.length - 1; start++) {
            for (int end = start + 1; end < nums.length; end++) {
                int summ = sum[end] - sum[start] + nums[start];
                if (summ == target || (target != 0 && summ % target == 0))
                    count++;
            }
        }
        return count;
    }
    @Test
    public void test(){
        int[] arr ={2,1,2,1,1,2,1,2};
        System.out.println(maxSubArray(arr,4));
    }
}
