package vivo;

//力扣-鸡蛋问题
public class Test3 {
    public static int superEggDrop(int k,int N){
        int[] dp=new int[k+1];
        int ans=0;
        while (dp[k]<N){
            for (int i=k;i>0;i--){
                dp[i]=dp[i]+dp[i-1]+1;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int k=1;
        int N=2;
        System.out.println(superEggDrop(k,N));
    }
}
