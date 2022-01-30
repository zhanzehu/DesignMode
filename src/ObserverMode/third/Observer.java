package ObserverMode.third;


//增加了抽象的观察者
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name,Subject sub)
    {
        this.name = name;
        this.sub = sub;
    }

    public abstract void Update();
}
