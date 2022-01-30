package PrototypeMode;

//原型类
public abstract class Prototype {

    private String id ;

    public Prototype(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //抽象类关键就是有这样的一个Clone方法
    public abstract Prototype Clone() throws CloneNotSupportedException;

    static void Main() throws CloneNotSupportedException {
        ConcretePrototypel p1 = new ConcretePrototypel("I");
        ConcretePrototypel c1 = (ConcretePrototypel)p1.Clone();
        System.out.println("克隆的"+c1.getId());
    }
}

class ConcretePrototypel extends Prototype {

    public ConcretePrototypel(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype)this.clone();
    }
}
