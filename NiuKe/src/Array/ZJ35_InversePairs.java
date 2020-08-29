package Array;
/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class ZJ35_InversePairs {
    static int res=0;
    public static int InversePairs(int [] array) {
        if(array==null||array.length<2) return 0;
        mergeSort(array,0,array.length-1);
        return res;
    }
    public static void mergeSort(int[] array,int l,int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(array,l,mid);
        mergeSort(array,mid+1,r);
        merge(array,l,mid,r);
    }
    public static void merge(int[] arr,int l,int m,int r){
        int[] help=new int[r-l+1];
        int p1=l;
        int p2=m+1;
        int i=0;
        while (p1 <= m && p2 <= r) {

            //如果前面元素小于后面元素，不能构成逆序对
            if(arr[p1]<=arr[p2]){
                help[i++] = arr[p1++];
            }else {
                //如果前面的元素大于后面的，那么在前面元素之后的元素都能和后面的元素构成逆序对
                help[i++] = arr[p2++];
                res=(res+(m-p1+1))%1000000007;
            }
        }
        //两个必有且只有一个越界，只执行一个
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }
    public static void main(String[] args) {
        //int[] arr = new int[] {1,2,3,4,5,6,7,0};
        int[] arr = new int[] {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        int sum = InversePairs(arr);//小和问题
        System.out.println("逆序数对个数:"+sum);
    }
}
