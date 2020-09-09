package xiaomi;


import java.util.Arrays;
import java.util.Scanner;
/*
123 12345678 123abcABC!!!
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strs=str.split(" ");
        System.out.println(Arrays.toString(strs));
        result(strs);
    }
    public static void result(String[] str){
        for (int i = 0; i <str.length ; i++) {
            if(str[i].length()<8 || str[i].length()>120){
                System.out.println(1);
                break;
            }
            for (int j = 0; j <str[i].length() ; j++) {
                panduan(str[i]);
            }
            System.out.println(0);
        }
    }
    public static void panduan(String str){
        int temp=0;
        for (int j = 0; j <str.length() ; j++) {

            if(str.charAt(j)>='0' && str.charAt(j)<='9'){
                temp++;
            }
            if(str.charAt(j)>='a' && str.charAt(j)<='z'){
                temp++;
            }
            if(str.charAt(j)>='A' && str.charAt(j)<='Z'){
                temp++;
            }
            if(str.charAt(j)-'0'>=33 && str.charAt(j)-'0'<=47){
                temp++;
            }
        }
        if(temp==4){
            System.out.println(2);
        }else{
            System.out.println(1);
        }
    }
}
