package huiwen;

import org.junit.Test;
//判断是否是回文字符串
public class isPalindromic {
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    @Test
    public void test(){
        System.out.println(isPalindromic("sadfdas"));
    }
}
