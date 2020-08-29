import org.junit.Test;
//爬楼梯a
public class climbStairs70 {
    public int climbStairs(int n){
        if(n<=2){
            return n;
        }
        int pre2=1;
        int pre1=2;
        for(int i=2;i<n;i++){
            int cur=pre1+pre2;
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }

    @Test
    public void test(){
        System.out.println(climbStairs(10));
    }
}
