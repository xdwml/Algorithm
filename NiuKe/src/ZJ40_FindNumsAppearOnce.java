import org.junit.Test;

import java.util.HashMap;

//数组中只出现一次的数字
public class ZJ40_FindNumsAppearOnce {
    //方法1 哈希法
    /*public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],2);
            }else {
                map.put(array[i],1);
            }
        }
        int count=0;
        for (int j = 0; j <array.length ; j++) {
            if(map.get(array[j])==1){
               if (count==0){
                   num1[0]=array[j];
                   count++;
               }else {
                   num2[0]=array[j];
               }
            }
        }
    }*/
    //方法2 位运算异或
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum^array[i];
        }
        //在sum中找到第一个不同的位数对数组进行分类，分为两个队列
        int index=1;//0001
        while ((index & sum)==0){//如果与运算为0，即没找到位数为1的位置
            index=index<<1;//左移寻找位数为1的位置，0010——0100-1000
        }
        int result1=0;
        int result2=0;
        for (int j = 0; j <array.length ; j++) {
            if((index & array[j])==0){//与运算
                result1=result1^array[j];//0^4^5^5=4
            }else{
                result2=result2^array[j];//0^2^3^6^3^2=6
            }
        }
        num1[0]=result1;
        num2[0]=result2;
    }
    @Test
    public void test(){
        int [] arr=new int[]{2,4,3,6,3,2,5,5};
        int [] num1=new int[1];
        int [] num2=new int[1];
        FindNumsAppearOnce(arr,num1,num2);
        System.out.println(num1[0]+","+num2[0]);
    }
}
