package String;

import org.junit.Test;

public class ZJ49_StrToInt {
    public int StrToInt(String str) {
        if(str==null||str.length()==0) return 0;

        int fuhao=0;
        if(str.charAt(0)=='-'){
            fuhao=1;
        }
        int sum=0;
        if(str.matches("")){
            Integer integer=new Integer(str);
            return integer;
        }else {
            return 0;
        }

    }
    @Test
    public void test(){
        System.out.println(StrToInt("+2147483647"));
        System.out.println(StrToInt("1a33"));
    }

}
