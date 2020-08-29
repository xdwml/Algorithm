package Array;

import java.util.ArrayList;
//顺时针打印矩阵
public class ZJ19_printMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length - 1;
        ArrayList<Integer> list=new ArrayList<>();
        while (a <= c && b <= d) {
            list=printEdge(matrix, a++, b++, c--, d--,list);
        }
        return list;
    }
    public static ArrayList<Integer> printEdge(int[][] m, int tR, int tC,
                                               int dR, int dC,ArrayList list) {
        if (tR == dR) {
            for (int i = tC; i <= dC; i++) {    list.add(m[tR][i]);       }
        } else if (tC == dC) {
            for (int i = tR; i <= dR; i++) {    list.add(m[i][tC]);        }
        } else {
            int curC = tC;
            int curR = tR;
            while (curC != dC) {     list.add(m[tR][curC]);       curC++;
            }
            while (curR != dR) {     list.add(m[curR][dC]);       curR++;
            }
            while (curC != tC) {     list.add(m[dR][curC]);       curC--;
            }
            while (curR != tR) {     list.add(m[curR][tC]);       curR--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        ArrayList list=printMatrix(matrix);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
