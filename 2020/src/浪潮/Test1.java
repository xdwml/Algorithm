package 浪潮;
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] nums=new int[sc.nextInt()];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int [] arr){
        if(arr==null||arr.length<2){
            return 0;
        }
        int res=0,anchor=0;
        int n=arr.length;
        for (int i = 0; i <arr.length ; ++i) {
            if(i>0 && arr[i-1]>=arr[i]){
                anchor=i;
            }
            res=Math.max(res,i-anchor+1);
        }
        return n-res;
    }
}
