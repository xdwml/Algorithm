package zhaoyin;

import org.junit.Test;
//寻找最小区间
public class main1 {
    public String minStr(String str1,String str2){
        int[] str1Char=new int[128];
        int[] str2Char=new int[128];
        for (int i = 0; i <str2.length() ; i++) {
            str2Char[str2.charAt(i)]++;//111111
        }

        int count=0;
        int left=0;
        int right=0;
        String result="";
        int minLength=str2.length();//222222
        while (right<str1.length()){
            char ch=str1.charAt(right);
            str1Char[ch]++;
            if(str2Char[ch] >0 && str2Char[ch]>=str1Char[ch]){
                count++;///3333
            }
            while(count== str2.length()){
                ch=str1.charAt(left);
                if(str2Char[ch] >0 && str2Char[ch]>=str1Char[ch]){
                    count--;
                }
                if(right-left+1<minLength){
                    minLength=right-left;
                    result=str1.substring(right,left);///444
                }
                right--;//5555
                left++;
            }
            right++;
        }
        return result;
    }
    @Test
    public void test(){
        String s=minStr("JDJSOJSNENDNSO","NDSO");
        System.out.println("结果为："+s);
    }
}
