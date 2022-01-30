package ObserverMode.first;

import java.util.LinkedList;

public class Secretary {

    //同事列表
    private LinkedList<StockObserver> observers = new LinkedList<StockObserver>();
    private String action;
    //增加
    public void Attach(StockObserver observer)
    {
        observers.add(observer);
    }

    //通知
    public void Notify()
    {
        for (StockObserver o:observers
             ) {
            o.Update();
        }
    }

    //前台状态
    public String SecertaryAction;

    public String getSecertaryAction() {
        return SecertaryAction;
    }

    public void setSecertaryAction(String secertaryAction) {
        SecertaryAction = secertaryAction;
    }
}
