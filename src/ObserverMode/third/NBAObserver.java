package ObserverMode.third;


//看NBA的同事
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println(sub.getSubjectState()+name+"关闭NBA直播，继续工作！");
    }
}
