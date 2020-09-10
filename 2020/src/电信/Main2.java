package 电信;

public class Main2 {
    public static void main(String[] args) {
        int j;
        int a,b,c,d;
        for (j = 0; j <=8888; j++) {
            a=j/1000;
            b=(j-a*1000)/100;
            c=(j-a*1000-b*100)/10;
            d=j-a*1000-b*100-c*10;
            if((j+b*1000+c*100+d*10+a)==8888 && d>=0){
                System.out.println(a+" "+b+" "+c+" "+d);
            }
        }
    }
}
