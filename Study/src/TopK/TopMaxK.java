package TopK;
import java.util.Arrays;
/**
 *
 */
public class TopMaxK {
	//找出N个数中最大的K个，使用小根堆，复杂度O(NlogK)
	public static void heapSort(int[] arr,int k) {
		if (arr == null || arr.length < 2) {
			return;
		}
		//1.建立小根堆
		for (int i = 0; i < k; i++) {
			heapInsert(arr, i);//调整为小根堆结构
		}
		int heapsize =k;//2.标记小根堆长度
		for (int j = heapsize; j <arr.length ; j++) {
			//如何其余元素比堆顶大，置换堆顶
			if(arr[j]>arr[0]){
				swap(arr, 0, j);//3.将更大的元素加入堆结构
				heapify(arr, 0, heapsize);//4.调整小根堆结构
			}
		}
	}
	//把数组调整小根堆，复杂度为O(N)
	public static void heapInsert(int[] arr, int index) {
		while (arr[index] < arr[(index - 1) / 2]) {
			swap(arr, index, (index - 1) / 2);
			index = (index - 1) / 2;
		} 
	}
	//变换小根堆
	public static void heapify(int[] arr, int index, int heapsize) {
		int left = index * 2 + 1;
		while (left < heapsize) {
			int min = left + 1 < heapsize && arr[left + 1] < arr[left]
					? left + 1 : left;
			min = arr[min] < arr[index] ? min : index;
			if (min == index) {
				break;
			}
			swap(arr, min, index);
			index = min;
			left = index * 2 + 1;
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static void main(String[] args) {
		int k=3;
		int[] arr1 = new int[] {8,2,6,7,9,10,3,1,5,4};
		System.out.println("排序前：");
		System.out.println(Arrays.toString(arr1));
		heapSort(arr1,k);//小根堆找出最大的k个数
		System.out.println("排序后：");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(Arrays.copyOf(arr1, k)));
	}
}
