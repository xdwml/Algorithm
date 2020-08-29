package huawei;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] strings=str.split(" ");
        long[] ints=new long[strings.length];
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=Long.parseLong(strings[i]);
        }
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=ganrao(ints[i]);
        }
        long[] f=new long[ints.length];
        f[0]=(ints[ints.length-1] & (((0x1) | ((0x1) << 1))));
        f[0] <<=(32-2);
        for (int i = 1; i <ints.length ; i++) {
            f[i]=(ints[i-1] & (((0x1) | ((0x1) << 1))));
            f[i] <<=(32-2);
        }
        for (int i = 0; i <ints.length ; i++) {
            ints[i]>>>=2;
            ints[i]=f[i] | ints[i];
        }
        for (int i = 0; i <ints.length ; i++) {
            System.out.print(ints[i]+" ");
        }
    }
    public static long ganrao(long i){

        return ((i & 0xaaaaaaaa)>>1) | ((i & 0x55555555)<<1);
    }
}
