package huiwen;

import org.junit.Test;

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
public class isPalindrome9 {
    //判断回文整数
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }
        int right=0;
        while(x>right){
            right=right*10 + x % 10;
            x/=10;
        }
        return x==right || x==right/10;//前面偶数位，后面奇数位
    }
    @Test
    public void test(){
        System.out.println(isPalindrome(1221));
    }

}
