package DesignMode;
interface Sourceable{    //定义一个公共接口
    public void method();
}
class Source implements Sourceable{  //定义被装饰类
    @Override
    public void method() {
        System.out.println("功能1");
    }
}
class Decorator implements Sourceable{   //定义装饰类
    private Sourceable source;
    public Decorator(Sourceable source){
        super();
        this.source=source;
    }
    @Override
    public void method() {
        source.method();
        System.out.println("功能2");
        System.out.println("功能3");
    }
}
public class TestDecorator {
    public static void main(String[] args) {
        Sourceable source=new Source();//创建被装饰者类对象
        System.out.println("装饰前");
        source.method();
        System.out.println("装饰后");
        Sourceable obj=new Decorator(source);//创建装饰类对象，并将被装饰者
        obj.method();
    }
}
