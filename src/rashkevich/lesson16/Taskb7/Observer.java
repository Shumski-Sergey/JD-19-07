package rashkevich.lesson16.Taskb7;

public class Observer implements Runnable{
    private Currency rubs;
    private Currency buks;
    private Bank bank;
    private int downLimitMoney;

    public Observer(Bank bank, int downLimitMoney) {
        this.rubs=new Currency(5000,00,"RUB");
        this.buks=new Currency(5000,00,"$");
        this.bank=bank;
        this.downLimitMoney=downLimitMoney;
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

    @Override
    public void run() {
        int count=0;
        while(count<300){
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Cashier cashier:bank.getCashierArrayList()){
                if (cashier.getRubs().getMoney()<=downLimitMoney){
                    Currency rub=new Currency(300,00,"RUBS");
                    this.take(rub);
                    System.out.println("Observer:"+ cashier);
                    cashier.refill(rub);
                    System.out.println("Observer refilled "+rub+" "+cashier);
                }

                if (cashier.getBuks().getMoney()<=downLimitMoney){
                    Currency dollar=new Currency(300,00,"$");
                    this.take(dollar);
                    System.out.println("Observer:"+ cashier);
                    cashier.refill(dollar);
                    System.out.println("Observer refilled "+dollar+" "+cashier);
                }
            }
            count++;
        }
    }
}
