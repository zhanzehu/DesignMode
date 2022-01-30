package DecoratorMode;

public class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}

class ConcreteDecratorA extends Decorator
{
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "new State";
        System.out.println("A");
    }
}

class ConvreteDecratorB extends Decorator
{
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("B");
    }

    private void AddedBehavior()
    {

    }
}


abstract class Component
{
    public abstract void Operation();
}

class ConcreteComponent extends Component
{
    @Override
    public void Operation() {
        //具体对象的操作
    }
}

class Main
{
    static void Main(){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecratorA d1 = new ConcreteDecratorA();
        ConvreteDecratorB d2 = new ConvreteDecratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}
