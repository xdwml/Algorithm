package ReDo;

import org.junit.Test;

import java.util.Arrays;

public class T11_NumberOf1 {
    //方法1：位运算
    public int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        int flag=1;
        int count=0;
        for (int i = 0; i <32 ; i++) {
            if((flag & n)!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }
    //理解方式
    public int NumberOf12(int n) {
        if(n==0){
            return 0;
        }else if(n>0){
            String str=Integer.toString(n,2);
            int count=0;
            for (int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            return count;
        }else {
            int m=-n;
            String str=Integer.toString(m,2);//二进制
            System.out.println("二进制："+str);
            char [] chars=new char[32];//32位
            //原码32位
            int index=str.length();
            for (int i=chars.length-1;i>=0;i--){
                if(--index>=0){
                    chars[i]=str.charAt(index);

                }else {
                    chars[i]=0;
                }

            }
            System.out.println("原码："+Arrays.toString(chars));
            //反码
            for (int i = 0; i <chars.length ; i++) {
                if(chars[i]=='1'){
                    chars[i]='0';
                }else {
                    chars[i]='1';
                }
            }
            System.out.println("反码："+Arrays.toString(chars));
            //补码
            chars[chars.length-1]='1';
            System.out.println("补码："+Arrays.toString(chars));
            //计算位数
            int sum=0;
            for (int i=0;i<chars.length;i++){
                if(chars[i]=='1'){
                    sum++;
                }
            }
            return sum;
        }

    }

    @Test
    public void test(){
       // System.out.println(NumberOf1(8));
        System.out.println(NumberOf1(-1));

    }
}
