package Array;

import org.junit.Test;

public class ZJ45_isContinuous {
    public boolean isContinuous(int [] numbers) {
        //1.插入排序
        if(numbers==null||numbers.length<2) return false;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        //2.统计0的个数和间隔个数
        int numberofZero=0;
        int numberofGap=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==0) numberofZero++;
        }
        //从非0的下一处开始指针
        int index=numberofZero+1;
        //3.统计间隔个数
        while(index<numbers.length){//指针小于数组长度
            //3.1出现对子返回false
            if(numbers[index]==numbers[index-1]){
                return false;
            }
            //3.2间隔统计
            numberofGap+=numbers[index]-numbers[index-1]-1;//间隔大于2，间隔数+1
            //3.3跳下一索引
            index++;
        }
        System.out.println("0的个数："+numberofZero+";间隔个数："+numberofGap);
        //4.判断间隔和0的个数
        if(numberofGap>numberofZero){
            return false;
        }else {
            return true;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    @Test
    public void test(){
        int[] arr1=new int[]{1,3,5,0,0};//空缺等于0个数
        System.out.println("是否为顺子："+isContinuous(arr1));
        int[] arr2=new int[]{1,3,6,0,0};//空缺大于0个数
        System.out.println("是否为顺子："+isContinuous(arr2));
        int[] arr3=new int[]{1,3,6,5,0};//
        System.out.println("是否为顺子："+isContinuous(arr3));
        int[] arr4=new int[]{1,3,6,5,3};//对子
        System.out.println("是否为顺子："+isContinuous(arr4));
    }
}
