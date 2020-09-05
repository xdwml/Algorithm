package sougou;

import org.junit.Test;

public class Main2 {
    public int findMethods(int n,int [] array){

        int index=0;
        for (int i = 0; i <array.length-2 ; i+=2) {
            double count=(array[i+2]-(double)(array[i+3]/2))-(double) (array[i]+(array[i+1]/2));
            if(count==n){
                index=index+1;
            }
            if(count>n){
                index=index+2;
            }
        }
        return index+2;
    }
    @Test
    public void test(){
        int [] array={-1,4,5,2};
        System.out.println("应该输出4，实际输出是："+findMethods(2,array));

        int [] array2={-8,4,-2,2,4,2};

        System.out.println("应该输出5，实际输出是："+findMethods(3,array2));

        System.out.println("应该输出6，实际输出是："+findMethods(2,array2));
        int [] array3={-1,4,5,3};

        System.out.println("应该输出2，实际输出是："+findMethods(3,array3));

        int [] array4={-1,4};

        System.out.println("应该输出2，实际输出是："+findMethods(2,array4));

    }
}
