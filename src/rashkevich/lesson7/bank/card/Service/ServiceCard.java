package rashkevich.lesson7.bank.card.Service;

import rashkevich.lesson7.bank.card.Model.VisaElectron;

public class ServiceCard {
    public static void main(String...client){
        VisaElectron card=new VisaElectron();
        card.reсeiveMoney();
        card.sellMoney();
    }
}
