package aiqiyi;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
public class Main2 {
    public String isPathCrossing(String path) {
        Set<Integer> vis = new HashSet<Integer>();
        int x = 0, y = 0;
        vis.add(getHash(x, y));
        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hashValue = getHash(x, y);
            if (!vis.add(hashValue)) {
                return "True";
            }
        }
        return "False";
    }
    public int getHash(int x, int y) {
        return x * 20001 + y;
    }
    @Test
    public void test(){
        System.out.println(isPathCrossing("ESSWNEE"));
    }
}
