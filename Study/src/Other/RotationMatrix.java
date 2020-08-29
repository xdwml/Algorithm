package Other;

public class RotationMatrix {

    //转圈90度打印矩阵
    public static void PrintMatrix(int [][] arr){
        //定义左上角的点（a，b）,右下角的点（c，d）
        int a=0;
        int b=0;
        int c=arr.length-1;
        int d=arr[0].length-1;
        //每一圈分别交换
        while(a<c && b<d){
            PrintEdge(arr,a++,b++,c--,d--);
        }
    }
    public static void PrintEdge(int [][] arr,int a,int b,int c,int d){
        int times=c-a;//定义循环次数
        int tmp=0;//临时
        for (int i = 0; i <times ; i++) {
            tmp=arr[a][b+i];//左上角及其右边取出
            arr[a][b+i]=arr[c-i][b];//左下角及其上依次取代左上角及其右
            arr[c-i][b]=arr[c][d-i];//右下角及其左依次取代左下角及其上
            arr[c][d-i]=arr[a+i][d];//右上角及其下依次取代右下角及其左
            arr[a+i][d]=tmp;//左上角及其右边的临时值依次取代右上角及其下
        }


    }


    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println("旋转前：");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length  ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        PrintMatrix(matrix);//测试
        System.out.println("旋转后：");
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length  ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
