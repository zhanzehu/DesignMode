package ObserverMode.second;



//看股票的同事
public class StockObserver extends Observer {
    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println(sub.SecretaryAction+name+"关闭股票行情，继续工作！");
    }
}
