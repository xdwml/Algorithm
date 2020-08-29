import java.util.Arrays;
/**
 *随机快速排序算法
 */
public class Code_04_QuickSort {
	//随机快速排序
	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}
	public static void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			//加上此条为随机快排,随机选择一个位置和最后一个交换，保证代码复用
			swap(arr, l + (int) (Math.random() * (r - l + 1)), r);//忽略此条之后为经典快排
			int[] p = partition(arr, l, r);
			quickSort(arr, l, p[0] - 1);
			quickSort(arr, p[1] + 1, r);
		}
	}
	public static int[] partition(int[] arr, int l, int r) { //荷兰国旗问题，默认最后一个数作为划分
		int less = l - 1;
		int more = r;//r处的值不参与遍历
		while (l < more) {
			if (arr[l] < arr[r]) {
				swap(arr, ++less, l++);//位置不动，less+1
			} else if (arr[l] > arr[r]) {
				swap(arr, --more, l);//
			} else {
				l++;
			}
		}
		swap(arr, more, r);//让最右边的x归位
		return new int[] { less + 1, more };//长度为2
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
		quickSort(arr1);//快速排序
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
