package 广联达;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 打怪兽
 */
public class Main3 {
    public static void main(String[] args) {
        jineng();
    }
    public static void jineng(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();//怪物的数量，也是数组的长度
        int x = sc.nextInt();//技能的范围
        sc.nextLine();//继续读取下一行
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++){
            strArr[i] = sc.nextLine();//每次读一行
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] location = new int[length];
        for (int i = 0; i < length; i++){
            String[] s = strArr[i].split(" ");
            location[i] = Integer.parseInt(s[0]);
            for (int i1 = 0; i1 < s.length; i1++) {
                map.put(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
            }
        }

        Arrays.sort(location);
        int res = map.get(location[0]);
        int start = location[0];
        int end = location[0]+2*x;
        for (int i = 1; i < length; i++){
            if (location[i] <= end && location[i] >= start){
                //如果下一个位置在技能范围内
                int val = map.get(location[i]) - map.get(location[0]);
                if (val > 0){
                    res = res + val;
                }
            }else{
                res = res + map.get(location[i]);
            }
            //然后更新start和end范围
            start = location[i];
            end = location[i] + 2*x;
        }
        System.out.println(res);

    }
}
