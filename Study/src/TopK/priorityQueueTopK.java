package TopK;

import java.util.Arrays;
import java.util.PriorityQueue;

public class priorityQueueTopK {
    public static void main(String[] args) {
       PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        int k=3;
        int[] arr = new int[] {8,2,6,7,9,10,3,1,5,4};
        for (int i = 0; i <arr.length ; i++) {
            priorityQueue.add(arr[i]);
        }
        System.out.println("排序前："+ Arrays.toString(arr));
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=priorityQueue.poll();
        }
        System.out.println("排序后："+ Arrays.toString(Arrays.copyOf(arr1, k)));
    }
}
