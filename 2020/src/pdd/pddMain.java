package pdd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class pddMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
