package huawei;

import java.util.Scanner;
public class H37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(Count(month));
        }
    }
    public static int  Count(int month){
        if(month==1 || month ==2){
            return 1;
        }
        return Count(month-1)+ Count(month-2);
    }
}
