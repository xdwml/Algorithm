import java.util.Arrays;
/**
 *归并排序算法
 */
public class Code_05_MergeSort {
	//归并排序
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}
	public static void mergeSort(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		int mid =  l+((r-l)/2);//L和R中间的点,防止(l +r)/2这种写法溢出
		mergeSort(arr, l, mid);//左部分排序
		mergeSort(arr, mid + 1, r);//右部分排序
		merge(arr, l, mid, r);//外排序
	}
	public static void merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];//辅助数组
		int i = 0;
		int p1 = l;//左侧的第一个数
		int p2 = m + 1;//右侧的第一个数
		//谁小填谁,偶数
		while (p1 <= m && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		//两个必有且只有一个越界，只执行一个
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[l + i] = help[i];
		}
	}

	// for test  样本测试
	public static void main(String[] args) {
		boolean succeed=true;
		int[] arr1 = new int[] {8,2,6,7,9,10,3,1,5,4};
		int[] arr2 = new int[] {8,2,6,7,9,10,3,1,5,4};
		System.out.println("排序前：");
		printArray(arr1);//打印原数组
		mergeSort(arr1);//归并排序
		System.out.println("排序后：");
		printArray(arr1);//打印排序数组
		comparator(arr2);//正确算法的排序数组
		if (!isEqual(arr1, arr2)) {
			succeed = false;//比较绝对正确的算法和自己的排序算法是否结果一致
		}
		System.out.println(succeed ? "排序正确" : "排序错误");
		int[] input=new int[]{4,5,1,6,2,7,3,8};
		System.out.println("排序前：");
		printArray(input);//打印原数组
		mergeSort(input);//归并排序
		System.out.println("排序后：");
		printArray(input);//打印排序数组

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
