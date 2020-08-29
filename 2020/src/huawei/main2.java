package huawei;

import com.sun.corba.se.impl.ior.FreezableList;
import com.sun.media.jfxmediaimpl.platform.gstreamer.GSTPlatform;
import jdk.internal.dynalink.linker.LinkerServices;

import javax.lang.model.element.NestingKind;
/*import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] split = str.split("]");

        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        int a=0;
        for (int i = 0; i < split[0].length(); i+=2) {
            list1.add(Integer.parseInt(String.valueOf(split[0].charAt(i))));
           //// if(list1.get(a)<1)
        }

    }
    public static int result(ArrayList<Integer> list1,ArrayList<Integer> list2){
        List<Integer> hight=new ArrayList<>();
        for (int i = 0; i <list1.size() ; i++) {
            for (int j = 0; j <list1.get(i) ; j++) {
                hight.add(list2.get(i));
            }
        }
        int n=hight.size();
        int [] left=new int[n];
        int [] right=new int[n];
        for (int i = 0; i <right.length ; i++) {
            right[i]=n;
        }
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i <n; i++) {
            while(!st.isEmpty() && hight.get(st.peek())>=hight.get(i)){
                right[st.peek()]=i;
                st.pop();
            }
            int temp=st.isEmpty() ?-1:st.peek();
            left[i]=temp;
            st.push(i);
        }
        int res=0;
        for (int i = 0; i <n ; i++) {
           res=Math.max(res,(right[i]-left[i]-1)*hight.get(i))
        }
        return res;
    }
}*/
