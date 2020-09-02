package ReDo;

import org.junit.Test;

public class T6_minNumberInRotateArray {
    public int minNumberInRotateArray(int[] array){
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
    public int minNumberInRotateArray2(int [] array) {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(end-start==1)
                return array[end];
            if(array[mid]>=array[start])
                start=mid;
            if(array[mid]<=array[end])
                end=mid;
        }
        return -1;

    }
    @Test
    public void test(){
        int[] arr={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));
        System.out.println(minNumberInRotateArray2(arr));
    }
}
