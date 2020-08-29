package ReDo;

import org.junit.Test;

/**
 * 实现一个函数，将字符串中每个空格都替换成“%20”
 * we are happy
 */
public class T2_replaceSpace {
    public String replaceSpace(StringBuffer str){
        if(str==null){
            return null;
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
    @Test
    public void test(){
        StringBuffer str=new StringBuffer("we are happy");
        System.out.println(replaceSpace(str));
    }
}
