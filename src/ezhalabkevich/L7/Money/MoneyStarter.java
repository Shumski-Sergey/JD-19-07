package ezhalabkevich.L7.Money;

import ezhalabkevich.L7.Money.model.Money;
import ezhalabkevich.L7.Money.service.impl.MoneyServiceImpl;

public class MoneyStarter {
    public static void main(String[] args) {
        Money money1 = new Money();
        money1.setRubl(14563);
        money1.setCoin((byte) 65);
        System.out.println("копейки  "+money1.getCoin());
        Money money2=new Money();
        money2.setRubl(1956);
        money2.setCoin((byte) 87);
        System.out.println("копейки "+money2.getCoin());
        MoneyServiceImpl.Plus(money1,money2);
    }
}
