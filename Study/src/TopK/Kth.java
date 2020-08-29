package TopK;

import java.util.Arrays;
import java.util.PriorityQueue;

//力扣215，第K大的数
public class Kth {
    public static void main(String[] args) {
        int [] arr={3,2,1,5,6,4};
        System.out.println("排序前："+Arrays.toString(arr));
        System.out.println("无序数组中第K大的数为："+Kth(arr,2));//5
        System.out.println("排序后："+Arrays.toString(arr));
    }
    //方法1：Arrays排序：时间复杂度O(nlogn),空间复杂度O(1)
   /* public static int Kth(int[] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }*/
    //方法2：堆排序：时间复杂度O(nlogk),空间复杂度O(1)
    /*public static int Kth(int[] arr,int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();//小根堆
        for (int val:arr) {
            priorityQueue.add(val);
            if(priorityQueue.size()>k)//维护K个大小的堆
                priorityQueue.poll();
        }
        return priorityQueue.peek();
    }*/
    //方法3：快速排序：时间复杂度O(n),空间复杂度O(1)
    public static int Kth(int[] arr,int k){
        k=arr.length-k-1;
        int l=0,h=arr.length-1;
        while (l<h){
            int j=partition(arr,l,h);
            if(j==k){
                break;
            }else if(j<k){
                l=j+1;
            }else {
                h=j-1;
            }
        }
        return arr[k];
    }
    public static int partition(int[] arr,int l,int h){
        int i=l,j=h+1;
        while (true){
            while (arr[++i]<arr[l]&&i<h);
            while (arr[--j]>arr[l]&&j>l);
            if(i>=j){
                break;
            }
            swap(arr,i,j);
        }
        return j;
    }
    public static void swap(int [] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
}
