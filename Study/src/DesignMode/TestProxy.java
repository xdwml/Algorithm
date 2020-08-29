package DesignMode;
//代理模式：求职找工作
interface Work{    //定义一个工作接口
    void find();
}

class Real implements Work{  //定义本人真实找工作
    @Override
    public void find() {
        System.out.println("投递简历");
    }
}

class Proxy implements Work{   //定义代理类
    private Work work;
    public Proxy(Work work){
        this.work=work;
    }
    @Override
    public void find() {
        System.out.println("合法验证");
        work.find();
        System.out.println("反馈结果");
    }
}
public class TestProxy{
    public static void main(String[] args) {
        Work work=null;
        work=new Proxy(new Real());
        work.find();
    }
}
