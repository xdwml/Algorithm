package 科大讯飞;

import java.util.Scanner;

/**
 * @program: day04
 * @description:
 * @author: Marvin
 * @create: 2020-07-31 15:40
 * 是否為矩形
 *
 */
public class IsRectang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] num1 = new int[8];
        for(int i =0;i<8;i++){
            // num1[i] = Integer.parseInt(num[i]);
            num1[i] = in.nextInt();
        }

        lest(num1);

    }
    public static void lest(int[] arr){
        int[] rec1 = new int[4];
        int[] rec2 = new int[4];
        for(int i = 0;i<4;i++){
            rec1[i] = arr[i];
            rec2[i] = arr[i+4];
        }
        if(
                (Math.min(rec1[2],rec2[2])>=Math.max(rec1[0],rec2[0]))
                        &&(Math.min(rec1[3],rec2[3])>=Math.max(rec1[1],rec2[1]))
        ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}