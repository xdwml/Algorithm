package DesignMode;
//饿汉式单例
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private static Singleton single = new Singleton();
    //公有静态方法，返回单例对象
    public static Singleton getInstance() {
        return single;
    }
}*/
//懒汉式单例
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private static Singleton single =null;
    //公有静态方法，返回单例对象
    public static Singleton getInstance() {
        if(single == null){
            single = new Singleton();
        }
        return single;
    }
}*/
//懒汉式单例,线程安全
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private static Singleton single = null;
    public synchronized static Singleton getInstance() {
        //注意：里面的判断是一定要加的，否则出现线程安全问题
        if(single == null){
            single = new Singleton();
        }
        return single;
    }
}*/
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private static Singleton single = null;
    public static Singleton getInstance() {
        //等同于 public synchronized static Singleton getInstance()
        synchronized(Singleton.class){
            //注意：里面的判断是一定要加的，否则出现线程安全问题
            if(single == null){
                single = new Singleton();
            }
        }
        return single;
    }
}*/
//双重校验锁实现对象单例,线程安全
public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private volatile static Singleton single = null;
    //双重校验锁
    public static Singleton getInstance() {
        //先判断对象是否已被实例过，没有被实例化过才进入加锁代码
        if (single == null) {                   //第一次检查
            synchronized (Singleton.class) {    //类对象加锁
                if (single == null) {           //第二次检查
                    single = new Singleton();   //问题的根源处在这里
                }
            }
        }
        return single;
    }
}
//静态内部类实现
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //静态内部类
    private static class InnerObject{
        private static Singleton single = new Singleton();
    }
    public static Singleton getInstance() {
        return InnerObject.single;
    }
}*/
//static静态代码块实现
/*public class Singleton {
    //私有构造方法
    private Singleton() {}
    //创建私有静态对象
    private static Singleton single = null;
    //静态代码块
    static{
        single = new Singleton();
    }
    public static Singleton getInstance() {
        return single;
    }
}*/
//内部枚举类实现
/*public class SingletonFactory {
    //内部枚举类
    private enum EnmuSingleton{
        Singleton;
        private Singleton singleton;
        //枚举类的构造方法在类加载是被实例化
        private EnmuSingleton(){
            singleton = new Singleton();
        }
        public Singleton getInstance(){
            return singleton;
        }
    }
    public static Singleton getInstance() {
        return EnmuSingleton.Singleton.getInstance();
    }
}
class Singleton{
    public Singleton(){}
}*/

