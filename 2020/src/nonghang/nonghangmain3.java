package nonghang;
import java.util.*;
//扑克牌排序
public class nonghangmain3 {

    public static void main(String[] args) {
        String[] cards=new String[]{"s1","s3","s9","s4","h1","p3","p2","q5","q4","q9","k2","k1"};
        System.out.println("排序前："+Arrays.toString(cards));
        getPokerOrder(cards);
        System.out.println("排序后："+Arrays.toString(cards));

    }
   public static String[] getPokerOrder(String[] cards){
       for (int i = 0; i <cards.length; i++) {
           char c=cards[i].charAt(0);
           if(c !='k' && c!='s' && c!='h' && c!='p' && c!='q' ){
               throw new RuntimeException("输入不合法");
           }
           int num=Integer.parseInt(cards[i].substring(1));
           if(num<0 || num >13){
               throw new RuntimeException("输入不合法");
           }
       }
       HashMap<Character,Integer> map=new HashMap<>();
       map.put('k',0);
       map.put('s',1);
       map.put('h',2);
       map.put('p',3);
       map.put('q',4);
       String[] res=cards;
       Arrays.sort(res, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               char c1=o1.charAt(0);
               char c2=o2.charAt(0);
               if(c1==c2){
                   return  Integer.parseInt(o1.substring(1))-Integer.parseInt(o2.substring(1));
               }else {
                   return (map.get(c1)-map.get(c2));
               }
           }
       });
       return res;
   }

}
