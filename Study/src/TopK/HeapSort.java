package TopK;
import java.util.Arrays;
/**
 *堆排序算法
 */
public class HeapSort {
	//堆排序
	public static void heapSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr, i);
		}
		int heapsize = arr.length;
		//
		swap(arr, 0, --heapsize);
		while (heapsize > 0) {
			heapify(arr, 0, heapsize);
			swap(arr, 0, --heapsize);
		}
	}
	//把数组建立小根堆，复杂度为O(N)
	public static void heapInsert(int[] arr, int index) {
		while (arr[index] > arr[(index - 1) / 2]) {//即使跳到0，（0-1）/2==0在计算机里为0
			swap(arr, index, (index - 1) / 2);
			index = (index - 1) / 2;
		} 
	}
	//若数组元素变化，变换大根堆
	public static void heapify(int[] arr, int index, int heapsize) {
		//1.左孩子坐标，heapsize表示当前形成堆的大小
		int left = index * 2 + 1;
		while (left < heapsize) {
			//比较方法1
			int largest = left + 1 < heapsize && arr[left + 1] > arr[left]? left + 1 : left;

			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {
				break;
			}
			swap(arr, largest, index);
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
		int[] arr1 = new int[] {11,6,10,14,13,9,12};
		//int[] arr1 = new int[] {25,84,21,47,15,27,68,35,20};
		System.out.println(Arrays.toString(arr1));
		heapSort(arr1);//堆排序
		System.out.println(Arrays.toString(arr1));

	}



}
