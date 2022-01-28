package templateMethodMode;

/*AbstractClass是抽象类，其实也就是一抽象模板，定义并实现了
一个模版方法。这个模版方法一般是一个具体方法，它给出了一个顶
级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类
实现。顶级逻辑也有可能调用一些具体方法。
* */
public abstract class AbstractClass {

    //一些抽象的行为，放到子类去实现
    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    //模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，它们都推迟到子类去实现
    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
    }

    //客户端代码
    static void Main(){
        AbstractClass c;

        c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}

class ConcreteClassA extends AbstractClass
{
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}

class ConcreteClassB extends AbstractClass
{
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}