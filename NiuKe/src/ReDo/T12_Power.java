package ReDo;

import org.junit.Test;

//求一个浮点型的整数次方,不能同时为0
public class T12_Power {
    public double Power(double base,int exponent){
        double mul=1.0;
        if(base==0.0){
            return 0.0;
        }
        if(exponent>0){
            for (int i = 0; i <exponent ; i++) {
                mul=mul*base;
            }
            return mul;
        }else if(exponent==0){
            return 1.0;
        }else {
            for (int i = 0; i <-exponent ; i++) {
                mul=mul*exponent;
            }
            return 1/mul;
        }
    }
    @Test
    public void test(){
        System.out.println(Power(2.0,3));
    }
}
