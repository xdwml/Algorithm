import java.util.Objects;
interface Patent{
    String na=null;
    int mon=0;
    public void hah();
}
class Parent{
    String name;
    int money;
    public void say(){
        System.out.println(name+"拥有财产"+money+"元！");
    }
}

class Child extends Parent implements Patent{
    int age;
    public void say(){
        System.out.println(name+"才"+age+"岁,就拥有财产"+money+"元！");
    }
    public void sayAge(){
        System.out.println(name+"的年龄是"+age+"岁");
    }

    public void hah(){
        System.out.println(na+mon);
    }
}

public class chongzai {
    public static void main(String[] args) {
        Child c=new Child();
        c.name="小明";
        c.age=18;
        c.money=500000;
        c.say();
        c.sayAge();

        c.hah();
        Parent p=new Parent();
        p.money=1000;
        p.name="小明的巴巴";
        p.say();

        Parent pc=new Child();
        p.money=10000;
        p.name="小明的";
        pc.say();

    }

}
