public class bloom {
    /**
     * 把第30000个元素描黑
     * @param args
     */
    public static void main(String[] args) {
        int[] arr=new int[1000];//1000个桶，整数4字节，每字节8比特，共32000比特位

        int index=30000;//想把第30000比特为上描黑
        int intIndex=index/32;//定位30000属于哪个数组的桶中
        int bitIndex=index%32;//定位30000属于数组桶的比特位置
        System.out.println("数组位置："+intIndex);
        System.out.println("比特位置："+bitIndex);
        //表示在937个桶中的第16个位置应该被描黑
        arr[intIndex]=(arr[intIndex] |(1<< bitIndex));//1左移比特个位置再或
        System.out.println(arr[intIndex]);
    }
}
