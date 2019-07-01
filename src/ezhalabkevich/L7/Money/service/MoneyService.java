package ezhalabkevich.L7.Money.service;

import ezhalabkevich.L7.Money.model.Money;

public interface MoneyService {
    public static void Plus(Money money1, Money money2){}
    public void Minus(Money money1, Money money2);
    public void Del(Money money1, Money money2);
    public void DelNum(Money money);
    public void MultNum(Money money);
    public void Compare(Money money1, Money money2);

}
