package ListNode;
public class ZJ46_LastRemaining_Solution {
    public static int LastRemaining_Solution(int n, int m) {
        if(n<=0){
            return -1;
        }
        int index=0;
        for (int i = 2; i <=n ; i++) {
            index=(index+m)%i;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(10,3));
    }
}
