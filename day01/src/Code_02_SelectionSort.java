import java.util.Arrays;
/**
 *选择排序算法
 */
public class Code_02_SelectionSort {
	//选择排序
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			swap(arr, i, minIndex);
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
		selectionSort(arr1);//选择排序
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
