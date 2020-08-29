package Other;

public class PrintMatrix {
    //转圈打印矩阵
    public static void PrintMatrix(int [][] arr){
        //定义左上角的点（a，b）,右下角的点（c，d）
        int a=0;
        int b=0;
        int c=arr.length-1;
        int d=arr[0].length-1;
        //每一圈分别打印
        while(a<c && b<d){
            PrintEdge(arr,a++,b++,c--,d--);
        }
    }
    public static void PrintEdge(int [][] arr,int a,int b,int c,int d){
        //如果只有一行
        if(a==c){
            for(int i=b;i<=d;i++){
                System.out.print(arr[a][i]+" ");
            }
        }else if(b==d){   //如果只有一列
            for(int i=a;i<=c;i++){
                System.out.print(arr[b][i]+" ");
            }
        }
        //定义当前圈内的A和B
        int CurA=a;
        int CurB=b;
        //将该行打印，行号不变，列号增加
        while(CurB<d){
            System.out.print(arr[a][CurB]+" ");
            CurB++;
        }
        //将该列打印，行号增加，列号不变
        while(CurA<c){
            System.out.print(arr[CurA][c]+" ");
            CurA++;
        }
        //将该行打印，行号不变，列号减小
        while(CurB>b){
            System.out.print(arr[c][CurB]+" ");
            CurB--;
        }
        //将该列打印，行号减小，列号不变
        while(CurA>a){
            System.out.print(arr[CurA][b]+" ");
            CurA--;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        PrintMatrix(matrix);//测试

    }
}
