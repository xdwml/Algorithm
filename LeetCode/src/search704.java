import org.junit.Test;
//二分查找
public class search704 {
    public int search(int[] nums,int target){
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }
            //如果
            if(target>nums[mid]){
                left=mid+1;
            }
            if(target<nums[mid]){
                right=mid-1;
            }
        }
        return -1;
    }
    @Test
    public void test(){
        int[] arr=new int[]{-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr,target));
        int target2=2;
        System.out.println(search(arr,target2));
    }
}
