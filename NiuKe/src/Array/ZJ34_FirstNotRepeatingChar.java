package Array;

import org.junit.Test;
//第一次出现一次的字符
public class ZJ34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str==null || str.length()==0){
            return -1;
        }
        int[] count = new int[256];
        //用一个类似hash的东西来存储字符出现的次数，很方便
        for(int i=0; i < str.length();i++){

            count[str.charAt(i)]++;
        }
        //没有在第一时间想到只要在遍历一遍数组并访问hash记录就可以了
        for(int i=0; i < str.length();i++){
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    @Test
    public void test(){
        String str="abaccdeff";
        int i=FirstNotRepeatingChar(str);

        System.out.println(str.charAt(i));

    }
}
