package bytedance;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 0 || s == null) {
            return;
        }
        //0~i的最少分割次数
        int[] dp = new int[s.length()];
        dp[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            dp[i] = juge(s.substring(0, i + 1)) ? 0 : i;
            for (int j = i; j >= 1; j--) {
                if (juge(s.substring(j, i + 1))) {
                    dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        System.out.println(dp[s.length() - 1] > 0 ? "Yes" : "No");
    }

    public static boolean juge(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
