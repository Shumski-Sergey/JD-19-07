package rashkevich.lesson16.Taskb7;


public class Cashier {
    private int id;
    private Currency buks;
    private Currency rubs;
    private final double RATE=2.1;
    private final int START_COUNT=500;

    public Cashier(int id) {
        this.id = id;
        this.buks =new Currency(START_COUNT,00,"$");
        this.rubs=new Currency(START_COUNT,00,"RUB");
    }

    public Currency take(Currency currency){
        Currency takeCurrency=new Currency(currency.getMoney(),currency.getCoin(),currency.getName());
        switch(currency.getName()){
            case "$":   buks.minus(currency);
                break;
            case "RUB": rubs.minus(currency);
                break;
        }
        return takeCurrency;
    }

    public void refill (Currency currency){
        //Currency refillCurrency=new Currency(currency.getMoney(),currency.getCoin(),currency.getName());
        switch(currency.getName()){
            case "$":   buks.plus(currency);
                break;
            case "RUB": rubs.plus(currency);
                break;
        }
    }

    public void transfer(Currency currency){
        refill(currency);
    }

    public void pay(Currency currency){
        refill(currency);
    }

    public void exchangeRubInBuks(Currency currency){
        switch(currency.getName()){
            case "$": refill(currency);
                        Currency rubExchange=new Currency(currency.getMoney(),currency.getCoin(),"RUB");
                        rubExchange=Currency.multiply(rubExchange,RATE);
                        take(rubExchange);
                break;
            case "RUB":
                break;
        }
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", buks=" + buks +
                ", rubs=" + rubs +
                ", rate=" + RATE +
                '}';
    }
}
