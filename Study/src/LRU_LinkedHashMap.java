import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//LRU缓存是LinkedHashMap的一个重要应用,最少最近使用
public class LRU_LinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    private static final int Max_entries=3;
    protected boolean removeEldersEntry(Map.Entry eldest){
        return size()>Max_entries;
    }
    LRU_LinkedHashMap(){
        super(Max_entries,0.75f,true);
    }
    public static void main(String[] args) {
        LRU_LinkedHashMap map=new LRU_LinkedHashMap();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map);
        map.put(4,"d");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map);
        map.put(5,"e");
        System.out.println(map);
    }

}
