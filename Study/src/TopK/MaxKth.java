package TopK;

import java.util.Arrays;
//无序数组中第K大的数
public class MaxKth {
    public static void main(String[] args) {
        int [] arr={2,6,5,4,9,7,1,3};
        System.out.println("排序前："+Arrays.toString(arr));
        System.out.println("无序数组中第K大的数为："+maxKth(arr,3));
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static int maxKth(int[] arr,int k){
        //1.边界判定
        if(arr==null && arr.length==0){
            return 0;
        }
        //2.建立大根堆
        for (int i = 0; i <arr.length ; i++) {
            heapInsert(arr,i);
        }
        int heapsize=arr.length;
        swap(arr,0,--heapsize);
        while (heapsize>0){
            heapify(arr,0,heapsize);
            swap(arr,0,--heapsize);

        }

        return arr[k-1];
    }
    public static void heapInsert(int[] arr, int index){
        while (arr[index]<arr[(index -1)/2]){
            swap(arr,index,(index -1)/2);
            index=(index -1)/2;
        }
    }
    public static void heapify(int[] arr,int index,int heapsize){
        int left=2*index+1;
        while (left<heapsize){
            int min=left+1<heapsize && arr[left+1]<arr[left]?left+1:left;
            min=arr[min]>arr[index]?index:min;
            if(min==index){
                break;
            }
            swap(arr,index,min);
            index=min;
            left=index*2+1;
        }
    }
    public static void swap(int [] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }
}
