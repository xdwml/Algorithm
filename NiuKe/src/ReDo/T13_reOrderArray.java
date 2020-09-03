package ReDo;

import org.junit.Test;

import java.util.Arrays;

//将奇数放左边，偶数放右边，保持基本顺序，不使用额外空间
public class T13_reOrderArray {
    public void reOrderArray(int[] array){
        if(array==null || array.length<2) return;
        int i=0;
        for (int j = 0; j <array.length ; j++) {
            if(array[j]%2==1){
                int tem=array[j];
                for (int k = j-1; k >=+i ; k--) {
                    array[k+1]=array[k];
                }
                array[i++]=tem;
            }
        }
    }
    @Test
    public void test() {
        int[] temp = {1, 2, 4, 6, 5, 8, 9};
        reOrderArray(temp);
        System.out.println(Arrays.toString(temp));
    }
}
