import org.junit.Test;

import java.util.Arrays;

public class longPreString {
    //编写一个函数来查找字符串数组中的最长公共前缀。
    public static String longPreString(String[] strs){
        //1.检查字符串数组合法性
        if(strs==null){
            return " ";
        }
        if(strs.length<2){
            return strs[0];
        }
        //2.新建数组，保存结果
        StringBuffer result=new StringBuffer();
        int len=strs.length;
        //3.将字符串数组排序
        Arrays.sort(strs);
        //4.取首尾字符串的最小长度
        int num=Math.min(strs[0].length(),strs[len-1].length());

        for (int i = 0; i <len; i++) {
            if(strs[0].charAt(i) == strs[len-1].charAt(i)){
                result.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return result.toString();

    }
    @Test
    public void test(){
        String[] strs=new String[]{"flower","flow","flight"};
        String[] strs2=new String[]{"dog","cat","pick"};
        System.out.println(Arrays.toString(strs));
        System.out.println(longPreString(strs));
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(strs2));
        System.out.println(longPreString(strs2));
        System.out.println(Arrays.toString(strs2));
    }
}
