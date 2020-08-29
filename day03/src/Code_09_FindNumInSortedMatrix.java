/**
 * 在行列都排好序的矩阵中找数
 */
public class Code_09_FindNumInSortedMatrix {
	//在行列都排好序的矩阵中找数
	public static boolean isContains(int[][] matrix, int K) {
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col > -1) {
			if (matrix[row][col] == K) {
				return true;
			} else if (matrix[row][col] > K) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 1, 2, 3 },// 0
				{ 10, 12, 13, 15 },// 1
				{ 23, 24, 25, 26 },// 2
				{ 44, 45, 46, 47}// 3

		};
		int K = 25;
		System.out.println(isContains(matrix, K));
	}

}
