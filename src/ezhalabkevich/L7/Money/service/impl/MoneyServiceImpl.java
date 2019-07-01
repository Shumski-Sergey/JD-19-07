package ezhalabkevich.L7.Money.service.impl;

import ezhalabkevich.L7.Money.model.Money;
import ezhalabkevich.L7.Money.service.MoneyService;

public class MoneyServiceImpl implements MoneyService {

    public static void Plus(Money money1, Money money2) {
        long sumRubl;
        int sumCoin;
        int coin=0;

        sumRubl= money1.getRubl()+money2.getRubl();
        sumCoin=(money1.getCoin()+money2.getCoin());
        System.out.println("копейки"+sumCoin);
        if ((int)sumCoin>100){
            sumRubl+=(int)sumCoin/100;
           coin= (int)sumCoin%100;
        }
        System.out.println("Баланс равен "+sumRubl+","+coin+" рублей");
    }

    @Override
    public void Minus(Money money1, Money money2) {

    }

    @Override
    public void Del(Money money1, Money money2) {

    }

    @Override
    public void DelNum(Money money) {

    }

    @Override
    public void MultNum(Money money) {

    }

    @Override
    public void Compare(Money money1, Money money2) {

    }
}
