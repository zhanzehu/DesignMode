package proxyMode;

//代理类
public class Proxy2 implements IGiveGift{

    Pursuit gg;
    public Proxy2(SchoolGirl mm){
        gg = new Pursuit(mm);
    }


    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
