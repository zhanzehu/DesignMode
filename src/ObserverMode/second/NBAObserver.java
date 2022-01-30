package ObserverMode.second;



//看NBA的同事
public class NBAObserver extends Observer {
    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println(sub.SecretaryAction+name+"关闭NBA直播，继续工作！");
    }
}
