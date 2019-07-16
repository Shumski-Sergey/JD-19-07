package rashkevich.lesson16.Taskb7;


import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Cashier {
    private int id;
    private Currency buks;
    private Currency rubs;
    private final double RATE=2.1;
    private final int START_COUNT=500;
    private Semaphore semaphore=new Semaphore(1);
    private boolean free;

    public Cashier(int id) {
        this.id = id;
        this.buks =new Currency(START_COUNT,00,"$");
        this.rubs=new Currency(START_COUNT,00,"RUB");
        this.free=true;
    }

    public boolean isFree() {
        return free;
    }

    public synchronized void setFree(boolean free) {
        this.free = free;
    }

    public Currency getBuks() {
        return buks;
    }

    public Currency getRubs() {
        return rubs;
    }

    public Currency take(Currency currency){
        Currency takeCurrency=new Currency(currency.getMoney(),currency.getCoin(),currency.getName());
        try {
            semaphore.tryAcquire(1000,TimeUnit.MILLISECONDS);
        switch(currency.getName()){
            case "$":   buks.minus(currency);
                break;
            case "RUB": rubs.minus(currency);
                break;
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();

        return takeCurrency;
    }

    public void refill (Currency currency){
        Currency refillCurrency=new Currency(currency.getMoney(),currency.getCoin(),currency.getName());
        try {
            semaphore.tryAcquire(1000, TimeUnit.MILLISECONDS);
        switch(currency.getName()){
            case "$":   buks.plus(currency);
                break;
            case "RUB": rubs.plus(currency);
                break;
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }

    public void transfer(Currency currency){
        refill(currency);
    }

    public void pay(Currency currency){
        refill(currency);
    }

    public void exchange(Currency currency){
        switch(currency.getName()){
            case "$": refill(currency);
                        Currency rubExchange=new Currency(currency.getMoney(),currency.getCoin(),"RUB");
                        rubExchange=Currency.multiply(rubExchange,RATE);
                        take(rubExchange);
                break;
            case "RUB":refill(currency);
                        Currency buksExchange=new Currency(currency.getMoney(),currency.getCoin(),"$");
                         buksExchange=Currency.multiply(buksExchange,(1/RATE));
                        take(buksExchange);
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
