package ReDo;

public class T7_Fibonacci {
    //方法1：背包
    public int Fibonacci(int n) {
        int dp[] = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        if (n < 2) {
            return dp[n];
        }
        for (int i = 2; i <= n; i++) {
            int temp = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return dp[1];
    }

    public int Fibonacci2(int n) {
        //1.递归法，时间复杂度2^n，空间复杂度1
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    //2.数组法，时间复杂度n，空间复杂度n
    public int Fibonacci3(int n) {

        int ans[] = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }

    //3.优化存储
        /*
        其实我们可以发现每次就用到了最近的两个数，所以我们可以只存储最近的两个数
        sum 存储第 n 项的值
        one 存储第 n-1 项的值
        two 存储第 n-2 项的值
        */
    public int Fibonacci4(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int sum = 0;
        int two = 0;
        int one = 1;
        for (int i = 2; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }
}
