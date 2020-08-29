package didi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<int[]> arrayList=new ArrayList<int[]>();
        getSum(arrayList,n);
        System.out.println(arrayList.size());
        for (int i = 0; i <arrayList.size() ; i++) {
            int [] temp=arrayList.get(i);
            System.out.println(temp[0]+" "+temp[1]);
        }
    }
    public static void getSum(ArrayList<int[]> arrayList,int n){
        if(n<200 || n>999+999){
            return;
        }
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i = 100; i <=Math.min(999,n-100) ; i++) {
            if((!set.contains(i)) && decide(i,n-i)){
                arrayList.add(new int[] {i,n-i});
                set.add(i);
                set.add(n-i);
            }
        }
    }
    public static boolean decide(int i,int j){
        int ai=i/100;
        int bi=i/10%10;
        int ci=i%100%10;
        int aj=j/100;
        int bj=j/10%10;
        int cj=j%100%10;
        return ((ai!=bi) && (ai!=ci) && (bi!=ci) && (ai==aj) && (ci==bj) && (bj==cj));
    }
}
