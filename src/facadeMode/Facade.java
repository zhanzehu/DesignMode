package facadeMode;

//外观类
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade()
    {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethodA(){
        System.out.println("方法组A。。。");
        one.MethodOne();
        two.MethodTwo();
        three.MethodThree();
    }

    public void MethodB(){
        System.out.println("方法组B。。。");
        one.MethodOne();
        three.MethodThree();
    }

    //客户端调用
    public  void Main(){
        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();
    }

}

//四个子系统的类
class SubSystemOne
{
    public void MethodOne(){
        System.out.println("子系统方法一");
    }
}

class SubSystemTwo
{
    public void MethodTwo(){
        System.out.println("子系统方法二");
    }
}

class SubSystemThree{
    public void MethodThree(){
        System.out.println("子系统方法三");
    }
}

class SubSystemFour{
    public void MethodFour(){
        System.out.println("子系统方法四");
    }
}