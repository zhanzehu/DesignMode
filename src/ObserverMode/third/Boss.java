package ObserverMode.third;

import java.util.LinkedList;

public class Boss implements Subject {

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
    public String SubjectState;

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String SubjectState) {
        this.SubjectState = SubjectState;
    }
}
