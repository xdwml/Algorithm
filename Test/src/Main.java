import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static int main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int res=1;
        for (int i = arr.length-1; i >0 ; i++) {
            if(arr[i]==arr[i-1]){
                res*=arr[i];
            }
        }
        return res;
    }
}


