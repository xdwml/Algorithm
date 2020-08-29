package 面试题;

import java.util.HashMap;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        for (int i = 0; i <200 ; i++) {
            //map.put(i,String.valueOf(i));//第一问：有没有异常，返回值是啥
            map.put(i,""+i);//第二问：返回值
            map.remove(i-1);
        }
        System.out.println(map.size());
    }
}
