package StrategyMode.factoryEx;

public class CashFactory {

    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type)
        {
            case "正常收费":
                cs = new CashNormal();
            break;
            case  "满300反100":
                CashReturn crl = new CashReturn("300","100");
                cs = crl;
                break;
            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }

        return cs;

    }
}
