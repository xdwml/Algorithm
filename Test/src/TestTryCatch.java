public class TestTryCatch {
    public static void main(String[] args) {
        System.out.println("main"+TryC());
    }
    public static int TryC() {
        int a=2;
        try{
            ++a;
            System.out.println("try:"+a);

        }catch (Exception e){
            ++a;
            System.out.println("catch:"+a);
            return a;
        }finally {
            ++a;
            System.out.println("finally:"+a);
            return a;
        }
    }
}
