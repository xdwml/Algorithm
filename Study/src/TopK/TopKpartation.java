package TopK;

import java.util.Arrays;

public class TopKpartation {


    public static void selectTopK(int[] arr,int start,int end,int k){
        if(start<end){
            int p=partition(arr,start,end);
            //正好找到第K大的数
            if(p==k) {
                return;
            }
            //还要从index的右边找k-index个数
            if(p<k){
                selectTopK(arr,p+1,end,k);
            }else{ //k个数都在index的左边
                selectTopK(arr,start,p-1,k);
            }
        }
    }
    public static int partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return less+1;
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {

        int[] arr = new int[] {8,2,6,7,9,10,3,1,5,4};

        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        //partition(arr,0,arr.length-1);
        selectTopK(arr,0,arr.length-1,5);
        System.out.println("第K大的数为："+arr[5]);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));

    }
}
