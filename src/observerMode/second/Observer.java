package observerMode.second;

import observerMode.first.Secretary;

public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public Observer(String name,Secretary sub)
    {
        this.name = name;
        this.sub = sub;
    }

    public abstract void Update();
}
