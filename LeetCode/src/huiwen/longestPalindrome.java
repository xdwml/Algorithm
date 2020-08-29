package huiwen;

import org.junit.Test;

import java.lang.ref.SoftReference;

public class longestPalindrome {
    //5.判断一个字符串的最长回文子串

    public String subStringPalindrome(String str){
        if(str.length()<2){
            return str;
        }
        int len=0,index=0;
        for (int i = 0; i <str.length(); i++) {
            String substr=str.substring(i);
            if(isPalindrome(substr) && substr.length()>len){
                len=substr.length();
                index=i;
            }
            for (int j = str.length()-2; j >=i ; j--) {
                substr=str.substring(i,j+1);
                if(isPalindrome(substr) && substr.length()>len){
                    len=substr.length();
                    index=i;
                }
            }
        }
        return str.substring(index,index+len);
    }
    /*public String subStringPalindrome(String str){
        if(str.length()<2){
            return str;
        }
        for (int i = 0; i <str.length(); i++) {
            for (int j = i; j <str.length() ; j++) {
                String substr=str.substring(i,j+1);
                if(isPalindrome(substr) && substr.length()>len){
                    len=substr.length();
                    index=i;
                }
            }
        }
        return str.substring(index,index+len);
    }*/
    public boolean isPalindrome(String s){
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
        String str="babad";
        System.out.println(subStringPalindrome(str));
        String str2="cbbd";
        System.out.println(subStringPalindrome(str2));
        String str3="bb";
        System.out.println(subStringPalindrome(str3));
        String str4="ac";
        System.out.println(subStringPalindrome(str4));
        String str5="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(subStringPalindrome(str5));
    }
}
