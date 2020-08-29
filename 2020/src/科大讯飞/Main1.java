package 科大讯飞;

import java.util.HashMap;

public class Main1 {

    public static void main(String args[]){
        int n = 5;
        int number[] = {5,3,2,2,5};
        int sum = 55;
        int num=0;
        if(sum>0){
            while (sum>=100 && number[4]>0 ){
                sum-=100;
                --number[4];
                ++num;
            }
            while (sum>=50 &&number[3]>0 ){
                sum-=50;
                --number[3];
                ++num;
            }
            while (sum>=10 &&number[2]>0 ){
                sum-=10;
                --number[2];
                ++num;
            }
            while (sum>=5 &&number[1]>0 ){
                sum-=5;
                --number[1];
                ++num;
            }
            while (sum>=1 &&number[0]>0 ){
                sum-=5;
                --number[0];
                ++num;
            }
            if(sum>0){
                num=-1;
            }
        }
        System.out.println(num);
    }

}
