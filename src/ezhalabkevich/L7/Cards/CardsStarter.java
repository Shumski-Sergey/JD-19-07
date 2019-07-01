package ezhalabkevich.L7.Cards;

import ezhalabkevich.L7.Cards.model.CreditCards;
import ezhalabkevich.L7.Cards.model.DebetCard;
import ezhalabkevich.L7.Cards.service.CardsService;
import ezhalabkevich.L7.Cards.service.CardsServiceImpl;

public class CardsStarter {
    public static void main(String[] args) {
        CreditCards creditCards = new CreditCards();
        creditCards.setOverdraft(1000);
        creditCards.setPercentCredit(12.5);
        creditCards.setBalans(creditCards.getOverdraft());

        DebetCard debetCard = new DebetCard();
        debetCard.setPercentDebet(5);
        debetCard.setBalans(785);

       // while (creditCards.getBalans() > 0 || debetCard.getBalans() > 0) {
            if (creditCards.getBalans() > debetCard.getBalans()) {
                CardsServiceImpl.WantNewShoes(creditCards);
            } else CardsServiceImpl.WantNewShoes(debetCard);
      //  }
        if (debetCard.getBalans()<50){
            CardsServiceImpl.EarnMoney(debetCard);
        }
        if (creditCards.getOverdraft()!=100) CardsServiceImpl.TimeToPay(creditCards, debetCard);


    }
}
