package ObserverMode.second;


import java.util.LinkedList;

//前台秘书类
public class Secretary {

    //同事列表
    private LinkedList<Observer> observers = new LinkedList<Observer>();
    private String action;

    //增加
    public void Attach(Observer observer){
        observers.add(observer);
    }

    //减少
    public void Detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void Notify(){
        for (Observer o:observers
             ) {
            o.Update();
        }
    }

    //前台状态
    public String SecretaryAction;

    public String getSecretaryAction() {
        return SecretaryAction;
    }

    public void setSecretaryAction(String secretaryAction) {
        SecretaryAction = secretaryAction;
    }
}
