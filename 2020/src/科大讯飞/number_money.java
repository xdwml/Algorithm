package 科大讯飞;

import java.util.Scanner;

/**
 * @program: day04
 * @description:
 * @author: Marvin
 * @create: 2020-07-31 15:42
 */
public class number_money {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String firstLine = in.nextLine();
        String[] num = firstLine.split(" ");
        int[] num1 =new int[5];
        for(int i =0;i<5;i++){
            num1[i] = Integer.parseInt(num[i]);
        }
        int money = Integer.parseInt(in.nextLine());
        System.out.println(lest(num1,money));

    }
    public static int lest(int[] arr,int money){
        if(money<1){
            return -1;
        }
        int res = 0;
        while(money>0){
            if(money>=100&&arr[4]!=0){
                money = money-100;
                --arr[4];
                res++;
            }else if(money>=50&&arr[3]!=0){
                money = money-50;
                --arr[3];
                res++;
            }else if(money>=10&&arr[2]!=0){
                money = money-10;
                --arr[2];
                res++;
            }else if(money>=5&&arr[1]!=0){
                money = money-5;
                --arr[1];
                res++;
            }else if(money>=1&&arr[0]!=0){
                money = money-1;
                --arr[0];
                res++;
            }else{
                break;
            }
        }
        if(money>0){
            return -1;
        }else{
            return res;
        }
    }
}