package 美团;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        if(target<2178){
            System.out.println(0);
        }
        if(target>=2178 && target <21978){
            System.out.println(1);
            System.out.println(2178+" "+2178*4);
        }
        if(target>=21978 && target < 219978){
            System.out.println(2);
            System.out.println(2178+" "+2178*4);
            System.out.println(21978+" "+21978*4);
        }
        if(target>=219978 && target < 2199978){
            System.out.println(3);
            System.out.println(2178+" "+2178*4);
            System.out.println(21978+" "+21978*4);
            System.out.println(219978+" "+219978*4);
        }
        if(target>=2199978 && target < 21999978){
            System.out.println(4);
            System.out.println(2178+" "+2178*4);
            System.out.println(21978+" "+21978*4);
            System.out.println(219978+" "+219978*4);
            System.out.println(2199978+" "+2199978*4);
        }
    }
}
