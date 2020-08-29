package Sort;

public class Sort {
    public static void main(String[] args) {
        int[] arr={8,4,6,5,9,1,3,7,2,10};
        int[] arr1={8,4,6,5,9,1,3,7,2,10};
        System.out.println("排序前");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Insert(arr1);
        System.out.println("排序：");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    //冒泡排序
    public static void bubbleSort(int [] arr){
        if(arr==null || arr.length<2){
            return;
        }
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return;
    }
    //选择排序
    public static void select(int [] arr){
        if(arr==null || arr.length<2){
            return;
        }
        for (int i =0 ; i <arr.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j ;
                }
            }
            swap(arr,i,min);
        }
        return;
    }
    //插入排序
    public static void Insert(int [] arr){
        if(arr==null || arr.length<2){
            return;
        }
        for (int i =1 ; i <arr.length ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return;
    }

    //交换位置
    public static void swap(int [] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }

}

