package QQ;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, Set<Integer>> map=new HashMap<Integer, Set<Integer>>();
        Scanner scanner=new Scanner(System.in);
        int result=scanner.nextInt();
        int line=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<line;i++){
            int len=scanner.nextInt();
            Set<Integer> set=new HashSet<>(len);
            for (int j = 0; j <len ; j++) {
                set.add(scanner.nextInt());
            }
            for (int l:set) {
                if(map.containsKey(l)){
                    Set<Integer> in=map.get(l);
                    in.addAll(set);
                    map.put(l,in);
                }else {
                    map.put(l,set);
                }
            }
            scanner.nextLine();
        }
        HashSet<Integer> set=new HashSet<>();
        Queue<Integer> que=new LinkedList<>();
        Set<Integer> integerSet=map.get(0);
        for (int l:integerSet ) {
            set.add(l);
            if(l!=0){
                que.add(l);
            }
        }
        while(!que.isEmpty()){
            Integer po=que.poll();
            Set<Integer> integerSet1=map.get(po);
            for (int l:integerSet1) {
                if(!set.contains(l));{
                    que.add(l);
                    set.add(l);
                }
            }
        }
        System.out.println(set.size());
    }
}
