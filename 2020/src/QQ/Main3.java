package QQ;

import java.util.*;

/*
4 2
1
2
3
4
4 2
1
1
2
3

 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String str="";
        for (int i = 0; i <n ; i++) {
            str+=sc.next();
        }
        char [] ch=str.toCharArray();
        //System.out.println(Arrays.toString(ch));
        TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
        for (int i = 0; i <n ; i++) {
            if(map.containsKey(ch[i])){
                int value=map.get(ch[i]);
                map.remove(ch[i]);
                value++;
                map.put(ch[i],value);
            }else {
                map.put(ch[i],1);
            }
        }
        TreeMap<Character,Integer> map1=new TreeMap<Character,Integer>();
        for (int i = 0; i <k ; i++) {
            Character key=map.firstKey();
            System.out.print(key+" "+map.get(key));
            map1.put(key,map.get(key));
            map.remove(key);
            System.out.println();
        }
        while (!map1.isEmpty()){
            Character key=map1.firstKey();
            map.put(key,map1.get(key));
            map1.remove(key);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i = 0; i <k ; i++) {
            Map.Entry<Character, Integer> Entry = list.get(i);
            System.out.print(Entry.getKey()+" "+Entry.getValue());
            System.out.println();
        }
        /*for (int i = 0; i <k ; i++) {
            Character key=map.firstKey();
            System.out.print(key+" "+map.get(key));
            map.remove(key);
            System.out.println();
        }*/
    }

}
