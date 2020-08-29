public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        SubThread4 st=new SubThread4();
        Thread t=new Thread(st,"线程1");
        t.start();

        for (int i = 1; i <8 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==3){
                t.join();
            }
        }

        System.out.println("主线程执行");
    }
}
class SubThread4 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <6 ; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
