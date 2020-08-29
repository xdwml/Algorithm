package bigo;
//在一个字符串中找到第二个只出现4此的字符，如果不存在返回null
import java.util.LinkedHashMap;
public class Main {
    static int count=0;
    public static Character getSecondChar(String param){
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap();
        for(int i=0;i<param.length();i++){
            if(!hm.containsKey(param.charAt(i))){
                hm.put(param.charAt(i),1);
            }else{
                hm.put(param.charAt(i), hm.get(param.charAt(i))+1);
            }
        }
        for(Character key: hm.keySet()){
            int value=hm.get(key);
            if(value==4){
               count++;
               if(count==2){
                   return key;
               }
            }else {
                continue;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String str = "abcaaaefdabbhg";
        System.out.println(getSecondChar(str));
        String str2 = "aabbbbaaccdeff";
        System.out.println(getSecondChar(str2));
    }
}


