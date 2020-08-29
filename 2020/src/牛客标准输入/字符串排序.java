package 牛客标准输入;

import java.util.*;

public class 字符串排序 {
    //输入有两行，第一行n
    //第二行是n个空格隔开的字符串
    //对输入的字符串进行排序后输出
    /*public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        StringBuilder sb = new StringBuilder(i);
        Queue<String> strings = new PriorityQueue<>();
        for (int j = 0; j < i; j++) {
            strings.offer(scanner.next());
        }
        while (!strings.isEmpty()) {
            sb.append(strings.poll()).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] strs = line.split(" ");
            Arrays.sort(strs);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strs.length - 1; i++) {
                sb.append(strs[i]).append(" ");
            }
            sb.append(strs[strs.length - 1]);
            list.add(sb.toString());
        }
        list.forEach(System.out::println);
    }

}
