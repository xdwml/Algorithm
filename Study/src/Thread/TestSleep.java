package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        SubThread st=new SubThread();
        System.out.println("st的状态："+Thread.currentThread().getState());
        Thread t=new Thread(st,"线程1");
        System.out.println("t-new的状态："+t.getState());
        t.start();
        System.out.println("t-start的状态："+t.getState());
        for (int i = 1; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i+":"+new SimpleDateFormat("hh:mm:ss").format(new Date()));
            Thread.sleep(2000);
            System.out.println("main线程状态："+Thread.currentThread().getState());
            if(i==3){

                t.join();
                System.out.println("t-join的状态："+t.getState());
            }
            System.out.println("t的状态："+t.getState());
        }
    }

}
class SubThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            System.out.println("当前线程状态："+Thread.currentThread().getState());
        }
    }
}