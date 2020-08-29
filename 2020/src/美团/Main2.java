package 美团;

import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[2*n];
        for (int i = 0; i <2*n ; ) {
            arr[i]=sc.next();
            arr[i+1]=sc.next();
            i=i+2;
        }
        System.out.println(route(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int route(String [] arr){
        int count=0;
        String str=arr[0];
        for (int i = 1; i <arr.length ; ) {
            if(str.equals(arr[i])){
                count++;
                if(i+1<arr.length){
                    str=arr[i+1];
                }else {
                    break;
                }
            }
            i=i+2;
        }
        return count;
    }
}
