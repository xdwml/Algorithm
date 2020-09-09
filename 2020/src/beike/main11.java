package beike;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[][] strs=new String[n][4];
        for (int i = 0; i <n ; i++) {
            strs[i]=sc.nextLine().split(" ");
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(getRes(strs[i]));
        }
    }
    public static String getRes(String[] strs){
        int left=0;
        int right=0;
        if(strs[0].equals("S")) {
            if(strs[2].equals("J")){
                left++;
            }
            if(strs[3].equals("J")){
                left++;
            }
        }else if(strs[0].equals("J")) {
            if(strs[2].equals("B")){
                left++;
            }
            if(strs[3].equals("B")){
                left++;
            }
        }else if(strs[0].equals("B")) {
            if(strs[2].equals("S")){
                left++;
            }
            if(strs[3].equals("S")){
                left++;
            }
        }
        if(strs[1].equals("S")) {
            if(strs[2].equals("J")){
                right++;
            }
            if(strs[3].equals("J")){
                right++;
            }
        }else if(strs[1].equals("J")) {
            if(strs[2].equals("B")){
                right++;
            }
            if(strs[3].equals("B")){
                right++;
            }
        }else if(strs[1].equals("B")) {
            if(strs[2].equals("S")){
                right++;
            }
            if(strs[3].equals("S")){
                right++;
            }
        }
        return left>right ? "left":left==right?"same":"right";
    }
}
