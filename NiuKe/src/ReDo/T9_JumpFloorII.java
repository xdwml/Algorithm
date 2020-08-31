package ReDo;

public class T9_JumpFloorII {
    //方法1：规律是f(n) =2* f(n-1)
    public int JumpFloorII(int target) {
        int sum = 1;
        if(target == 0)
            return 0;
        for(int i = 1;i < target; i++)
            sum = 2* sum;
        return sum;
    }
}
