package TopK;
import java.util.Arrays;
/**
 *找出20个数中最大的5个
 */
public class TopK1 {
	//堆排序
	public static int[] heapSort(int[] arr,int k) {
		int[] top=new int[k];
		if (arr == null || arr.length < 2) {
			return top;
		}
		//1.存储小根堆
		for (int i = 0; i < k; i++) {
			top[i]=arr[i];
		}
		System.out.println("储存小根堆："+Arrays.toString(top));
		for (int j = 0; j < k; j++) {
			//调整为小根堆结构
			heapInsert(top, j);
		}
		System.out.println("调整小根堆："+Arrays.toString(top));
		//2.标记小根堆长度
		int heapsize =k;
		for (int x = heapsize; x <arr.length ; x++) {
			if(arr[x]>top[0]){
				//3.将更大的元素加入堆结构
				int temp=top[0];
				top[0]=arr[x];
				arr[x]=temp;
				//4.调整小根堆
				heapify(top, 0, heapsize);
				System.out.println("调整ing："+Arrays.toString(top));
			}
		}
		return top;
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
		//int[] arr1 = new int[] {8,2,6,20,50,68,80,7,9,66,99,10,3,1,5,4,12,16,18,100};
		int[] arr1 = new int[] {8,2,6,7,9,10,3,1,5,4};
		System.out.println("排序前：");
		System.out.println(Arrays.toString(arr1));
		int[] top=heapSort(arr1,3);//堆排序
		System.out.println("排序后：");
		System.out.println(Arrays.toString(top));
	}
}
