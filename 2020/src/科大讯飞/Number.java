package 科大讯飞;

public class Number {
    public static void main(String[] args) {
        System.out.println(hammingWeight(15));
    }
    public static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

}
