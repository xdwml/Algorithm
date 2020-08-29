package 顺丰;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] mb=new int[m];
        int[] mc=new int[m];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <m; i++) {
            mb[i]=sc.nextInt();
            mc[i]=sc.nextInt();
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for (int i = 0; i <m ; i++) {
            if(map.containsKey(mb[i])){
                if(mc[i]>map.get(mb[i])){
                    map.put(mb[i],mc[i]);
                }
            }else {
                map.put(mb[i],mc[i]);
            }
        }
        System.out.println(map);
        Arrays.sort(arr);
        if(arr[arr.length-1]<map.firstKey()){
            System.out.println(0);
        }else {
            int money=0;
            for (int i = 0; i <n; i++) {
                if(map.containsKey(arr[i])){
                    money=money+map.get(arr[i]);
                }
            }

            System.out.println(money);
        }
    }
}
