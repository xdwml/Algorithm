package vivo;

import java.util.Scanner;
//种花
public class Test1 {

    public static int PlaceFlowers(int[] flowerbed,int n){
        if(flowerbed==null ||flowerbed.length <3){
            return 0;
        }
        int cnt=0,i=0,len=flowerbed.length;
        while (i<len){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0)
                               && (i==len-1 ||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                cnt++;
            }
            if (cnt>=n){
                return cnt;
            }
            i++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int[] arr = null;
        while (scanner.hasNextLine()) {
            int a = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < a; i++) {
                s = scanner.nextLine();
                String[] str = s.split(" ");

                for (int j = 0; j < str.length; j++) {
                    arr[j]=Integer.parseInt(str[j]);
                }
            }
            break;
        }
        System.out.println(PlaceFlowers(arr,7));
    }
}
