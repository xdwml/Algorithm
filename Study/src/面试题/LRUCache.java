package 面试题;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * 最近最少使用缓存，该缓存会删除最近最少使用的项目，
 * 初始化时指定最大容量，当缓存被填满时，它应该删除最近最少使用的项目
 * 应支持获取数据get和写入数据put
 */
//方法1：使用LinkedHashMap
/*
public class LRUCache {
    int capactity;
    Map<Integer,Integer> map;
    public LRUCache(int capactity){
        this.capactity=capactity;
        map=new LinkedHashMap<>();
    }
    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        //先删除旧的位置，再放入新位置
        Integer value=map.remove(key);
        map.put(key,value);
        return value;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
            return;
        }
        map.put(key,value);
        if(map.size()>capactity){
            map.remove(map.entrySet().iterator().next().getKey());
        }
    }
}
*/
//方法2：双向链表+HashMap
public class LRUCache {
    class DoubleLinkedNode{
        int key;
        int val;
        DoubleLinkedNode next;
        DoubleLinkedNode pre;
        DoubleLinkedNode(){};
        DoubleLinkedNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    private Map<Integer,DoubleLinkedNode> cache=new HashMap<Integer, DoubleLinkedNode>();
    private int size;
    private int capacity;
    private DoubleLinkedNode head,tail;
    public LRUCache(int capacity){
        this.size=0;
        this.capacity=capacity;
        head=new DoubleLinkedNode();
        tail=new DoubleLinkedNode();
        head.next=tail;
        tail.pre=head;
    }
    public int get(int key){
        DoubleLinkedNode node=cache.get(key);
        //if key not exists,return -1
        if(node==null){
            return -1;
        }
        //if key exists,first find location by hashmap,then move head
        moveToHead(node);
        return node.val;
    }
    public void put(int key,int value){
        DoubleLinkedNode node=cache.get(key);
        if(node==null){
            //if key not exists,create a new node
            DoubleLinkedNode newNode=new DoubleLinkedNode(key,value);
            //add the hashmap
            cache.put(key,newNode);
            //add the head of the listNode
            addToHead(newNode);
            ++size;
            if(size>capacity){
                //delete the tail node of the listNode
                DoubleLinkedNode tail=removeTail();
                cache.remove(tail.key);
                --size;
            }
        }else {
            //如果key存在，先通过哈希表定位，在修改value，并移动到头部
            node.val=value;
            moveToHead(node);
        }
    }

    private void moveToHead(DoubleLinkedNode node){
        removeNode(node);
        addToHead(node);
    }
    private void removeNode(DoubleLinkedNode node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    private void addToHead(DoubleLinkedNode node){
        node.pre=head;
        node.next=head.next;
        node.pre.next=node;
        node.next.pre=node;
    }
    private DoubleLinkedNode removeTail(){
        DoubleLinkedNode res=tail.pre;
        removeNode(res);
        return res;
    }


    @Test
    public void test(){
        LRUCache cache = new LRUCache( 2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        /*cache.put(3, 3);    // 该操作会使得关键字 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4*/
    }
}