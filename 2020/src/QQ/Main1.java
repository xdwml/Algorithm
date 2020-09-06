package QQ;

import java.util.Arrays;
import java.util.Scanner;
/*
6
6 5 4 3 2 1
5
6 5 3 2 1
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arrA=new int[a];
        for (int i = 0; i <a ; i++) {
            arrA[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int [] arrB=new int[b];
        for (int i = 0; i <b ; i++) {
            arrB[i]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(arrA));
        //System.out.println(Arrays.toString(arrB));
        int indexa=0;
        int indexb=0;

        while (indexa<a && indexb<b){
            if(arrA[indexa]==arrB[indexb]){
                System.out.print(arrA[indexa]+" ");
                indexa++;
                indexb++;
            }else if(arrA[indexa]>arrB[indexb]){
                indexa++;
            }else {
                indexb++;
            }
        }
    }
}
