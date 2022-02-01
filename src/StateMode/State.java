package StateMode;

public abstract class State {

    public abstract void Handle(Context context);
}

class ConcreteStateA extends State{
    @Override
    public void Handle(Context context) {


    }
}

class Context{
    private State state;
    public Context(State state){
        this.state = state;
    }

    public State State;

    public StateMode.State getState() {
        return State;
    }

    public void setState(StateMode.State state) {
        State = state;
        System.out.println("当前状态："+state);
    }
}
