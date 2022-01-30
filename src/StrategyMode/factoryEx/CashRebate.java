package StrategyMode.factoryEx;

//打折收费子类
public class CashRebate extends CashSuper{

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate){
        //输入打折费，初始化时，必需要输入折扣率，如八折，就是0.8
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
