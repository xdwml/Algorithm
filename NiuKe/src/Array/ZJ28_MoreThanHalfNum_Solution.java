package Array;

import org.junit.Test;
//数组中出现次数超过一半的数字
public class ZJ28_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length<0){
            return 0;
        }
        int result=array[0];
        int times=1;
        for(int i=1;i<array.length;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else if(array[i]==result){
                times++;
            }else{
                times--;
            }
        }

        int a=0;
        for(int j=0;j<array.length;j++){
            if(array[j]==result){
                a++;
            }
        }
        if(2*a>array.length){
            return result;
        }else{
            return 0;
        }

    }
    @Test
    public void test(){
        int[] array=new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println("数组中出现次数超过一半的数字为："+MoreThanHalfNum_Solution(array));
        String a="ab";
        String b="ab";
        String aa=new String("ab");
        String bb=new String("ab");

        int i = a.hashCode();
        System.out.println("a的hashcode:"+i);
        int j = b.hashCode();
        System.out.println("b的hashcode:"+j);
        int x = aa.hashCode();
        System.out.println("aa的hashcode:"+x);
        int y = bb.hashCode();
        System.out.println("bb的hashcode:"+y);
        System.out.println(a==aa);
        System.out.println(a==b);
        System.out.println(bb==aa);
        System.out.println(a.equals(aa));
        System.out.println(a.equals(b));
        System.out.println(aa.equals(bb));
        Object o=new Object();
        Object c=new Object();
        o.equals(c);


    }
}
