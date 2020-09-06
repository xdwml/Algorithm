package bytedance;

import java.util.Arrays;
import java.util.Scanner;

public class Main3_0906 {
    public static void main(String[] args) {
        int[] array={1,3,-9,2,4};
        //int[] array={-1,2};
        int m=3;
        int[] arr=new int[array.length*m];
        for (int i = 0; i <array.length; i++) {
            for (int j=0;j<m;j++){
                arr[i+j*array.length]=array[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(maxSubArray(arr));
        System.out.println(Arrays.toString(result(arr)));
        /*Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int count=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i]=sc.nextInt();
        }*/
    }
    public static int[] result(int[] arr){
        int ans = arr[0];
        int sum = 0;
        int start=0;
        int end=0;
        for(int i=1;i<arr.length;i++) {
            if(sum > 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
                start=i;
            }
            //ans = Math.max(ans, sum);
            if(sum>ans){
                ans=sum;
                end=i;
            }
        }
        //System.out.println(ans);
        //System.out.println(start);
        return new int[]{start,end,ans};
    }



}
