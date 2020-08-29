import java.util.Arrays;
/**
 *桶排序算法
 */
public class Code_06_BucketSort {

	// only for 0~200 value
	public static void bucketSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] bucket = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}
		int i = 0;
		for (int j = 0; j < bucket.length; j++) {
			while (bucket[j]-- > 0) {
				arr[i++] = j;
			}
		}
	}
	// for test  样本测试
	public static void main(String[] args) {
		boolean succeed=true;
		int[] arr1 = new int[] {8,2,6,7,9,10,3,1,5,4};
		int[] arr2 = new int[] {8,2,6,7,9,10,3,1,5,4};
		System.out.println("排序前：");
		printArray(arr1);//打印原数组
		bucketSort(arr1);//桶排序
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
