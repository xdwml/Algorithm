package huawei;

import java.util.Scanner;

public class HJ62 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(findNumberOf1(n));
        }
    }
    public static int findNumberOf1(int num){
        int count=0;
        String str=Integer.toBinaryString(num);
        char[] chars=str.toCharArray();
        for (char c: chars) {
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}
