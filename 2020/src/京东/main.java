package 京东;
import java.util.Scanner;
//十进制逆序后转五进制
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        StringBuilder sb= new StringBuilder(s);
        String str=sb.reverse().toString();
        System.out.println(str);
        String nixu=null;
        for (int i = 0; i <str.length() ; i++) {
            String substring = str.substring(i, i + 1);
            if(!substring.equals('0')){
                nixu=str.substring(i);
                break;
            }
        }
        System.out.println(nixu);
        int num=Integer.valueOf(nixu);
        System.out.println(num);
        transform(num,5);
    }
    public static void transform(int num,int n){
        int array[]=new int[100];
        int location=0;
        while(num!=0){
            int remain=num%n;
            num=num/n;
            array[location]=remain;
            location++;
        }
        show(array,location-1);
    }
    private static void show(int[] arr,int n){
        for (int i = n; i >=0; i--) {
            if(arr[i]>9){
                System.out.print((char)(arr[i]+55));
            }else {
                System.out.print(arr[i]);
            }
        }
    }
}
