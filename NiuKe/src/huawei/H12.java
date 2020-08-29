package huawei;

import java.util.Scanner;
public class H12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            arr=arr+str.charAt(i);
        }
        System.out.println(arr);
    }
}
