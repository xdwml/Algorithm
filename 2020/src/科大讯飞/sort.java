package 科大讯飞;

import java.util.Scanner;

/**
 * @program: day04
 * @description:
 * @author: Marvin
 * @create: 2020-07-31 15:41
 */
public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        int length = Integer.parseInt(firstLine);
        String secondLine = in.nextLine();
        String[] num = secondLine.split(" ");
        int[] num1 =new int[length];
        for(int i =0;i<length;i++){
            num1[i] = Integer.parseInt(num[i]);
        }
        quickSort(num1,0,length-1);

    }

    public static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int p = arr[left];
            int i = left;
            int j = right+1;
            while(true){
                while(arr[++i]<p){
                    if(i==right){
                        break;
                    }
                }
                while(arr[--j]>p){
                    if(j==left){
                        break;
                    }
                }
                if(i>=j){
                    break;
                }
                swap(arr,i,j);
            }

            swap(arr,j,left);
            for(int x = 0;x<arr.length;x++){
                System.out.print(arr[x]+" ");
            }
            System.out.println();
            quickSort(arr,left,j-1);
            quickSort(arr,j+1,right);
        }
    }


    public static void swap(int[] arr,int a,int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}