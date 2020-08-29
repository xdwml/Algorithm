package Array;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class ZJ42_FindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(array==null||array.length<2){
            return arrayList;
        }
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if(array[i]+array[j]==sum){
                    if(arrayList.size()>0){
                        if(arrayList.get(0)*arrayList.get(1)>array[i]*array[j]){
                            arrayList.set(0,array[i]<array[j]?array[i]:array[j]);
                            arrayList.set(1,array[i]>array[j]?array[i]:array[j]);
                        }
                    }else {
                        arrayList.add(array[i]<array[j]?array[i]:array[j]);
                        arrayList.add(array[i]>array[j]?array[i]:array[j]);
                    }

                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,3,4,5,6,8};
        ArrayList<Integer> arrayList = FindNumbersWithSum(arr, 10);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
