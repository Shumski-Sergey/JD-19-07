package rashkevich.lesson7.bank.card.Model;

public abstract class Card {
    private long id;
    private String name;
    private long balance;
    public abstract void reсeiveMoney();
    public abstract void sellMoney();
}
