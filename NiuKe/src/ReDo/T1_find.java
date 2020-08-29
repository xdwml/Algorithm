package ReDo;

import org.junit.Test;
//在一个有序二维数组中判断是否含有某整数
public class T1_find {
    public boolean find(int[][] martix,int target){
        int lies=martix[0].length;
        int hangs=martix.length;
        //判断二维数组,若有空返回false
        if(hangs==0 |lies==0){
            return false;
        }
        int lie=0;
        int hang=hangs-1;
        while (hang>=0 && lie<lies){

            if(target>martix[hang][lie]){
                lie++;
            }else if(target<martix[hang][lie]){
                hang--;
            }else {
                return true;
            }
        }
        return false;
    }
    @Test
    public void test(){
        int[][] martix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(find(martix,10));
    }

}
