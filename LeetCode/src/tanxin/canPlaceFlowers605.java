package tanxin;

import org.junit.Test;

public class canPlaceFlowers605 {
    //种花问题
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        for (int i = 0; i < len && cnt < n; i++) {
            if (flowerbed[i] == 1) {
                continue;
            }
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == len - 1 ? 0 : flowerbed[i + 1];
            if (pre == 0 && next == 0) {
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }

    @Test
    public void test(){
        int[] flowerbed={1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,2));
    }
}
