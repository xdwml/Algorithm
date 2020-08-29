import java.util.Arrays;
/**
 *堆排序算法
 */
public class Code_03_HeapSort {
	//堆排序
	public static void heapSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) { //1.整个数组变成大根堆
			heapInsert(arr, i);//0~i变成大根堆
		}
		int heapsize = arr.length;//2.标记大根堆的长度
		//3.大根堆排序
		swap(arr, 0, --heapsize);//3.1 0位置的最大值和最后一个互换，长度-1
		while (heapsize > 0) {//3.2直到将堆取完
			heapify(arr, 0, heapsize);//3.3取出当前大根堆的最大值后从0位置重新调整大根堆
			swap(arr, 0, --heapsize);//3.4 依次替换减小长度
		}
	}
	//把数组建立大根堆，复杂度为O(N)
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
			//2.不越界，右孩子和左孩子比较大小
			int largest = left + 1 < heapsize && arr[left + 1] > arr[left]
					? left + 1 : left;  //判断右孩子大还是左孩子大
			largest = arr[largest] > arr[index] ? largest : index;//3.用左右孩子中最大值和当前的元素替换
			if (largest == index) {//4.如果相等就跳出循环
				break;
			}
			swap(arr, largest, index);//5.不相等互换位置
			index = largest;//将大元素索引替换成当前索引，继续寻找子节点有没有更大的
			left = index * 2 + 1;//找左孩子
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	// for test  样本测试
	public static void main(String[] args) {
		boolean succeed=true;
		int[] arr1 = new int[] {8,2,6,7,9,10,3,1,5,4};
		int[] arr2 = new int[] {8,2,6,7,9,10,3,1,5,4};
		System.out.println("排序前：");
		printArray(arr1);//打印原数组
		heapSort(arr1);//堆排序
		System.out.println("排序后：");
		printArray(arr1);//打印排序数组
		comparator(arr2);//正确算法的排序数组
		if (!isEqual(arr1, arr2)) {
			succeed = false;//比较绝对正确的算法和自己的排序算法是否结果一致
		}
		System.out.println(succeed ? "排序正确" : "排序错误");



	}
	/*************验证************/
	// for test  1.准备一个绝对正确的方法，使用系统提供
	public static void comparator(int[] arr) {
		Arrays.sort(arr);//系统自带排序，绝对正确
	}

	// for test 2.测试两个数组是否相等
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if (arr1 == null && arr2 == null) {
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// for test  3.打印数组
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}
