package Top100;

import org.junit.Test;

public class isPalidromic5 {
    //方法1：暴力解法，超时
    /*public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        return ans;
    }
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }*/
    //方法2：最长公共子串
    public String longestPalindrome(String s) {
        if(s.equals("")){
            return "";
        }
        String origin=s;
        String reverse=new StringBuffer(s).reverse().toString();
        int length=s.length();
        int[][] arr=new int[length][length];
        int maxLen=0;
        int maxEnd=0;
        for (int i = 0; i < length; i++){
            for (int j = 0; j <length ; j++) {
                if(origin.charAt(i)==reverse.charAt(j)){
                    if(i==0||j==0){
                        arr[i][j]=1;
                    }else {
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
                if(arr[i][j]>maxLen){
                    maxLen=arr[i][j];
                    maxEnd=i;
                }
            }

        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);
    }


    @Test
    public void test(){
        System.out.println(longestPalindrome("babab"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("aacdefcaa"));
    }
}
