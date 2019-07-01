package ezhalabkevich.L7.Cards.service;

import ezhalabkevich.L7.Cards.model.CreditCards;
import ezhalabkevich.L7.Cards.model.DebetCard;
import ezhalabkevich.L7.Cards.service.CardsService;

import java.util.Objects;

public class CardsServiceImpl implements CardsService {

    public static void EarnMoney(DebetCard debetCard) {
        double money = 500;
        debetCard.setBalans(debetCard.getBalans() + money);
        System.out.println("Пришло время зарплаты! Баланс " + debetCard.getBalans());

    }



    public static void TimeToPay(CreditCards creditCards, DebetCard debetCard) {
        double spend = creditCards.getOverdraft() - creditCards.getBalans();
        double toPay = spend / 6 + spend * 0.01 * creditCards.getPercentCredit();
        System.out.println("К оплате по кредиту " + toPay);
        if (debetCard.getBalans() - toPay > 0) {
            debetCard.setBalans(debetCard.getBalans() - toPay);
            System.out.println("Кредит погашен. Баланс дебетовой карты " + debetCard.getBalans());
        } else {
            System.out.println("Недостаточно средств!");
            EarnMoney(debetCard);
            TimeToPay(creditCards, debetCard);
        }
    }


    public static void WantNewShoes(CreditCards creditCards) {
        if (creditCards.getBalans() - 190 > 0) {
            creditCards.setBalans(creditCards.getBalans() - 190);
            System.out.println("Туфли куплены по кредитной карте! Баланс " + creditCards.getBalans());
        } else System.out.println("Недостаточно средств!");


    }


    public static void WantNewShoes(DebetCard debetCard) {
        if (debetCard.getBalans() - 190 > 0) {
            debetCard.setBalans(debetCard.getBalans() - 190);
            System.out.println("Туфли куплены по дебетовой карте. Баланс " + debetCard.getBalans());
            debetCard.setBalans(debetCard.getBalans() + 190 * 0.01 * debetCard.getPercentDebet());
            System.out.println("Кэшбэк за покупку " + 190 * 0.01 * debetCard.getPercentDebet());
        }else System.out.println("Недостаточно средств! Нужно подождать до зарплаты!");
    }
}
