package 广联达;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 平行四边形
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int re=Area(arr);
        System.out.println(re);

    }
    public static int Area(int[] arr){
        if(arr==null||arr.length<4){
            return -1;
        }
        int res=1;
        int cou=0;
        Arrays.sort(arr);
        HashSet set=new HashSet();
        for (int j = arr.length-1; j >0 ; j--) {
            set.add(arr[j]);
            if(set.contains(arr[j-1])){
                res = res*arr[j-1];
                cou++;
                if (cou==2){
                    break;
                }
            }
        }
        if (cou==2){
            return res;
        }else {
            return -1;
        }

    }

}
