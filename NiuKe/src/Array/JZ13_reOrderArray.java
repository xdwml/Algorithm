package Array;

import org.junit.Test;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class JZ13_reOrderArray {
    public void reOrderArray(int [] array) {
        if (array.length<=1){
            return;
        }
        int num=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==1){
                num++;
            }
        }
        int [] help=new int[array.length];
        int index=0;
        for (int i = 0; i <help.length ; i++) {
            if(array[i]%2==1){
                help[index++]=array[i];
            }else {
                help[num++]=array[i];
            }
        }
        for ( index = 0; index <help.length ; index++) {
            array[index]=help[index];
        }
    }

    @Test
    public void test(){
        int[] arr=new int[]{1,3,2,5,6,4,7};
        System.out.println("原始数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reOrderArray(arr);
        System.out.println("重排数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
