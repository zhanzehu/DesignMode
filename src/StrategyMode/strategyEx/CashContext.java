package StrategyMode.strategyEx;

import StrategyMode.factoryEx.CashSuper;

public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper csuper){
        this.cs = csuper;
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
