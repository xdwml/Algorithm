package huawei;

import java.util.Scanner;
//找出字符串中只出现一次的字符
public class H59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            //System.out.println(Count(str));
        }
    }
    public static int  Count(int month){
        if(month==1 || month ==2){
            return 1;
        }
        return Count(month-1)+ Count(month-2);
    }
}
