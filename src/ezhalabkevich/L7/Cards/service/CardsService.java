package ezhalabkevich.L7.Cards.service;

import ezhalabkevich.L7.Cards.model.CreditCards;
import ezhalabkevich.L7.Cards.model.DebetCard;

public interface CardsService {
    public static void EarnMoney(DebetCard debetCard){}
    public static void TimeToPay(CreditCards creditCards, DebetCard debetCard){}
    public static void WantNewShoes(CreditCards creditCards){}
    public static void WantNewShoes(DebetCard debetCard){}
}
