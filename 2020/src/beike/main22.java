package beike;

import java.util.Arrays;
import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] arr=new String[s.length()/2];
        for (int i = 1; i <=s.length()/2 ; i++) {
            arr[i-1]=s.substring(0,i);
        }
        //System.out.println(Arrays.toString(arr));
        boolean flag=true;
        for (int i = arr.length-1; flag && i >=0; i--) {
            if(count(s,arr[i])>1){
                System.out.println(arr[i].length()+1+s.length()-2*arr[i].length());
                flag=false;
            }
        }
        if(flag){
            System.out.println(s.length());
        }
    }
    public static int count(String str,String sub){
        String s=str.replace(sub,"1");
        char[] chs=s.toCharArray();
        int count=1;
        for (int i = 0; i <chs.length-1 ; i++) {
            if(chs[i+1]==chs[i]){
                count++;
            }
        }
        return count;
    }
}
