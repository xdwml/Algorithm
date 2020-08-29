package bytedance;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] ms=new int[n];
        for (int i = 0; i <n; i++) {
            ms[i]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(ms));
        System.out.println(getMaxTime(ms,m-n));
    }
    public static int getMaxTime(int[] ms,int target){
        int time=0;
        long sum=0;
        int up = 1;
        int down = 1;
        for (int i = 0; i <ms.length ; i++) {
            sum=sum+ms[i];
        }
        int max=(int)sum/target;

        while (true){
            int cishu=0;
            int cishubefore = 0;
            for (int i = 0; i <ms.length ; i++) {
                cishubefore = cishu;
                cishu=cishu+ms[i]/max;
            }
            if(cishu>target && Math.abs(cishu-cishubefore)==1 || cishu ==target){
                time=max;
                break;
            }else if(cishu < target){
                max = max - down;
                down = down<<1;
                up = 1;
            } else {
                max = max + up;
                up = up <<1;
                down = 1;
            }
        }
        return time;
    }
}
