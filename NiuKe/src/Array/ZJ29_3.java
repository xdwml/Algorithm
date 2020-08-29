package Array;
import java.util.ArrayList;

//归并排序
public class ZJ29_3 {
    //归并排序
    public static ArrayList<Integer> mergeSort(int[] arr,int k) {
        ArrayList list=new ArrayList();
        if (arr == null || arr.length < 2) {
            return list;
        }
        if(k>arr.length) return list;
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid =  l+((r-l)/2);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;//左侧的第一个数
        int p2 = m + 1;//右侧的第一个数
        //谁小填谁,偶数
        while (p1 <= m && p2 <= r) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //两个必有且只有一个越界，只执行一个
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }


    public static void main(String[] args) {
        int[] input=new int[]{4,5,1,6,2,7,3,8};
        int k=4;
        System.out.println("排序前：");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        ArrayList list=mergeSort(input,k);


        System.out.println("排序后：");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();

        System.out.println("最小的k个数为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
