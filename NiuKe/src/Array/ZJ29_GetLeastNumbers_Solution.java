package Array;
import java.util.ArrayList;
//大根堆排序
public class ZJ29_GetLeastNumbers_Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list=new ArrayList();
        if (input == null || input.length < 2) {   return list;    }
        if(k>input.length){    return list;     }
        for (int i = 0; i < input.length; i++) {
            heapInsert(input, i);//0~i变成大根堆
        }
        int heapsize = input.length;//标记是否越界,大根堆的长度
        swap(input, 0, --heapsize);//3.1 0位置的最大值和最后一个互换，长度-1
        while (heapsize > 0) {//3.2直到将堆取完
            heapify(input, 0, heapsize);//从0位置重新调整大根堆
            swap(input, 0, --heapsize);//依次减小长度
        }
        for (int i = 0; i < k; i++) {     list.add(input[i]);    }
        return list;
    }
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {//即使跳到0，（0-1）/2==0在计算机里为0
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }
    //若数组元素变化，变换大根堆
    public static void heapify(int[] arr, int index, int heapsize) {
        int left = index * 2 + 1;//1.左孩子坐标，heapsize表示当前形成堆的大小
        while (left < heapsize) {
            int largest = left + 1 < heapsize && arr[left + 1] > arr[left] ? left + 1 : left;  //左孩子大
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {     break;     }
            swap(arr, largest, index);//
            index = largest;
            left = index * 2 + 1;
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
