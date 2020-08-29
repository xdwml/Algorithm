package Array;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class ZJ41_FindContinuousSequence {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();

        if(sum<3){
            return arrayList;
        }
        int small=1;
        int big=2;
        int middle=(1+sum)/2;
        int curSum=small+big;
        while (small<middle){
            if(curSum==sum){
                ArrayList<Integer> te=new ArrayList<>();
                for (int i = small; i <=big ; i++) {
                    te.add(i);
                }
                arrayList.add(te);
            }
            while (curSum>sum&&small<middle){
                curSum=curSum-small;
                small++;
                if(curSum==sum){
                    ArrayList<Integer> temp=new ArrayList<>();
                    for (int i = small; i <=big ; i++) {
                        temp.add(i);
                    }
                    arrayList.add(temp);
                }
            }
            big++;
            curSum+=big;
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = FindContinuousSequence(50);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
