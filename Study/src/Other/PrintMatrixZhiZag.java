package Other;

public class PrintMatrixZhiZag {

    //之字形打印矩阵
    public static void PrintMatrix(int [][] arr){
        int aR=0;//a点行号
        int aC=0;//a点列号
        int bR=0;//b点行号
        int bC=0;//b点列号
        int endR=arr.length-1;
        int endC=arr[0].length-1;
        boolean fromUp=false;
        while(aR != endR+1 ){ //如果a行走到最后一行循环停止，也可以写成b走到最后一列
            PrintEdge(arr,aR,aC,bR,bC,fromUp);
            aR= aC == endC ? aR+1:aR;//如果a来到最后一列，行号往下，否则不变
            aC= aC == endC ? aC:aC+1;//如果a来到最后一列，列号不变，否则往右
            bC= bR == endR ? bC+1:bC;//如果b来到最后一行，列号往右，否则不变
            bR= bR == endR ? bR:bR+1;//如果b来到最后一行，行号不变，否则往右

            fromUp=!fromUp;
        }
        System.out.println();
    }
    public static void PrintEdge(int [][] arr,int aR,int aC,int bR,int bC,boolean fromUp){
        if(fromUp){
            while (aR!=bR+1) {
                System.out.print(arr[aR++][aC--]+" ");
            }
        }else{
            while (bR!=aR-1) {
                System.out.print(arr[bR--][bC++]+" ");
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("前：");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length  ; j++) {
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("后：");
        PrintMatrix(matrix);//测试


    }
}
