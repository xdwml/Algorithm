package Array;
import java.util.ArrayList;
//小根堆排序
public class ZJ29_2 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list=new ArrayList();
        if (input == null || input.length < 2) {
            return list;
        }
        if(k>input.length){
            return list;
        }
        for (int i = 0; i < input.length; i++) {
            heapInsert(input, i);
        }
        System.out.println("建立小根堆：");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        int heapsize = input.length;
        swap(input, 0, --heapsize);
        while (heapsize > 0) {
            heapify(input, 0, heapsize);//调整小根堆
            swap(input, 0, --heapsize);
        }

        for (int i = input.length-1; i>input.length-k-1; i--) {
            list.add(input[i]);
        }
        return list;
    }
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] < arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
    public static void heapify(int[] arr, int index, int heapsize) {
        int left = index * 2 + 1;
        while (left < heapsize) {
            int min = left + 1 < heapsize && arr[left + 1] < arr[left]
                    ? left + 1 //右孩子大
                    : left;  //左孩子大
            min = arr[min] < arr[index] ? min : index;

            if (min == index) {
                break;
            }
            swap(arr, min, index);//
            index = min;
            left = index * 2 + 1;//找左孩子
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] input=new int[]{4,5,1,6,2,7,3,8};
        int k=4;
        System.out.println("输入原始数组：");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        ArrayList list=GetLeastNumbers_Solution(input,k);
        System.out.println("最小的k个数为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
