package DesignMode;
//代理模式：求职找工作
class Work2{    //定义一个工作接口
    void find() {
        System.out.println("找工作");
    }
}
class Real2 extends Work2{  //定义本人真实找工作

    public void find() {
        System.out.println("投递简历");
    }
}
class Proxy2 extends Work2{   //定义装饰类
    private Work2 work;
    public Proxy2(Work2 work){
        super();
        this.work=work;
    }
    public void find() {
        System.out.println("合法验证");
        work.find();
        System.out.println("反馈结果");
    }
}
public class TestProxy2{
    public static void main(String[] args) {
        Work2 work=null;
        work=new Proxy2(new Real2());
        work.find();
    }
}
