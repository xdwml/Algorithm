package 科大讯飞;
import java.util.Scanner;

/**
 * @program: day04
 * @description:
 * @author: Marvin
 * @create: 2020-07-31 15:36
 */
public class printNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(printNumber(s));
    }

    public static String printNumber(String s){
        boolean flag = true;
        StringBuffer str = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'&&flag){
                str.append(s.charAt(i));
                flag = false;
            }

            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                str.append(s.charAt(i));
            }
        }
        return str.toString();

    }

}