package beike;

import java.util.HashSet;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();

        System.out.println(result(s,length));
    }
    public static int result(String s,int length){
        HashSet<Character> set=new HashSet<>();
        length=s.length();
        for (int i = 0; i <length; i++) {
            set.add(s.charAt(i));
        }
        if(set.size()==length){
            return length;
        }
        int max_length=length/2;

        for (int i = max_length ; i>=0;i--) {
            int temp=0;
            for (int j = 0; j <= length-2*i ; j++) {
                if(issame(s,j,i)){
                    temp=i;
                    return length-temp+1;
                }
            }

        }
        return length;
    }
    public static boolean issame(String s,int j,int i){
        int k=i;
        while (k>0){
            if(s.charAt(j)==s.charAt(j+i)){
                j++;
                k--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
