import org.junit.Test;

public class ZJ33_GetUglyNumber_Solution {

    //方法1：时间效率低
    /*public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int i=0;
        while(index>0){
            ++i;
            if(IsUglyNumber(i)){
                --index;
            }
        }
        return i;
    }
    public boolean IsUglyNumber(int number){
        boolean IsUgly=false;
        while(number%2==0){
            number/=2;
        }
        while(number%3==0){
            number/=3;
        }
        while(number%5==0){
            number/=5;
        }
        if(number==1){
            IsUgly=true;
        }
        return IsUgly;
    }*/
    //方法2：空间换时间
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0){
            return 0;
        }
        int p2=0,p3=0,p5=0;//初始化三个指向三个潜在成为最小丑数的位置
        int[] result = new int[index];
        result[0] = 1;//
        for(int i=1; i < index; i++){
            result[i] = Math.min(result[p2]*2, Math.min(result[p3]*3, result[p5]*5));
            if(result[i] == result[p2]*2){
                p2++;//为了防止重复需要三个if都能够走到
            }
            if(result[i] == result[p3]*3){
                p3++;//为了防止重复需要三个if都能够走到
            }
            if(result[i] == result[p5]*5){
                p5++;//为了防止重复需要三个if都能够走到
            }
        }
        return result[index-1];
    }
    @Test
    public void test(){
        System.out.println(GetUglyNumber_Solution(1500));
    }
}
