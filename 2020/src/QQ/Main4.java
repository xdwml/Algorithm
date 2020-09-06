package QQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
    static HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] array=new int[len];
        for (int i = 0; i <len ; i++) {
            array[i]=in.nextInt();
            if(map.containsKey(array[i])){
                ArrayList<Integer> arrayList=map.get(array[i]);
                arrayList.add(i);
                map.put(array[i],arrayList);
            }else {
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(i);
                map.put(array[i],arrayList);
            }
        }
        find(array,len);
    }
    public static void find(int[] array,int len){
        Arrays.sort(array);
        ArrayList<Integer> list=new ArrayList<>(len);
        for (int i = 0; i <len ; i++) {
            list.add(0);
        }
        int l=len/2-1;
        int r=len/2;
        for (int i = 0; i <len ; i++) {
            if(i<=l){
                ArrayList<Integer> list1=map.get(array[i]);
                for(Integer str:list1){
                    list.set(str,array[r]);
                }
            }else {
                ArrayList<Integer> list1=map.get(array[i]);
                for(Integer str:list1){
                    list.set(str,array[l]);
                }
            }
        }
        for (int i: list) {
            System.out.println(i);
        }
    }
}
