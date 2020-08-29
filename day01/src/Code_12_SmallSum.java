
/**
 *小和问题
 */
public class Code_12_SmallSum {
	//小和问题
	public static int smallSum(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		return mergeSort(arr, 0, arr.length - 1);
	}
	public static int mergeSort(int[] arr, int l, int r) {
		if (l == r) {
			return 0;
		}
		int mid = l + ((r - l)/2);//防止(l +r)/2这种写法溢出
		return mergeSort(arr, l, mid) //左侧部分产生的小和
				+ mergeSort(arr, mid + 1, r)  //右侧部分产生的小和
				+ merge(arr, l, mid, r); //整体合并产生的小和
	}

	public static int merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;//左侧的第一个数
		int p2 = m + 1;//右侧的第一个数
		int res = 0;
		//谁小填谁,偶数
		while (p1 <= m && p2 <= r) {
			res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;//求解
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
		return res;
	}

	// for test
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,3,4,2,5};
		System.out.println("排序前：");
		printArray(arr1);//打印原数组
		int sum = smallSum(arr1);//小和问题
		System.out.println("排序后：");
		printArray(arr1);//打印排序数组


		System.out.println("小和"+sum);
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
