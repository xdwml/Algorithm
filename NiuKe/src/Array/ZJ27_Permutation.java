package Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

//字符串的排列
public class ZJ27_Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<String>();
        if(str!=null && str.length()>0){
            fun(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }

    public void fun(char[] chars, int i, ArrayList<String> list) {
        if(i== chars.length-1){
            String s=String.valueOf(chars);
            if(!list.contains(s)){
                list.add(s);
            }
        }else{
            for (int j =i ; j <chars.length ; j++) {
                swap(chars,i,j);
                fun(chars,i+1,list);
                swap(chars,i,j);
            }
        }
    }
    public void swap(char[] c,int i,int j){
        char tmp=c[i];
        c[i]=c[j];
        c[j]=tmp;
    }
    @Test
    public void test(){
        ArrayList<String> list=Permutation("abc");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
