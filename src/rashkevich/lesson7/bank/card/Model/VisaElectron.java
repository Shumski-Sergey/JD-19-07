package rashkevich.lesson7.bank.card.Model;

public class VisaElectron extends Visa{

    @Override
    public void reсeiveMoney() {
        System.out.println("receive money");
    }

    @Override
    public void sellMoney() {
        System.out.println("sell money");
    }
}
