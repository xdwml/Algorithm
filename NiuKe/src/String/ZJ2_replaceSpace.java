package String;

public class ZJ2_replaceSpace {
    //实现一个函数，将一个字符串中的每个空格替换成“%20”
    public static String replaceSpace(StringBuffer str){
        StringBuffer result=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                result.append("%20");
            }else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();

    }
}
