package huawei;


import java.util.ArrayList;
import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList list=new ArrayList();
        char[] chars=str.toCharArray();
        for (int i = chars.length-1; i >=0 ; i--) {
            list.add(chars[i]);
        }
        String arr="";
        for (int i = 0; i <list.size() ; i++) {
            arr=arr+list.get(i);
        }
        System.out.println(arr);
    }
}
