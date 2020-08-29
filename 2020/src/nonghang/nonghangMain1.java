package nonghang;

public class nonghangMain1 {
    public static void main(String[] args) {
        int num=123;
        System.out.println(triCoding(num));
        char c='s';
        String s=String.valueOf(c);
        System.out.println(s);
    }
    public static String triCoding(int num){
        String str=Integer.toString(num,3);
        StringBuffer sb=new StringBuffer(str);
        for (int i = 0; i <sb.length() ; i++) {
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'@');
            }
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'$');
            }
            if(sb.charAt(i)=='2'){
                sb.setCharAt(i,'&');
            }
        }
        return sb.toString();
    }

}
