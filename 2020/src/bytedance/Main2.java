package bytedance;
import java.util.Scanner;
public class Main2 {
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
        int sum=0;
        for (int i = 0; i <ms.length ; i++) {
            sum=sum+ms[i];
        }
        int max=sum/target;

        while (true){
            int cishu=0;
            for (int i = 0; i <ms.length ; i++) {
                cishu=cishu+ms[i]/max;
            }
            if(cishu>=target){
                time=max;
                break;
            }else {
                max--;
            }
        }
        return time;
    }
}
