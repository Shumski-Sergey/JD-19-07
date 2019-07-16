package rashkevich.lesson16.Taskb7;

import tolifer.L7.paymentCard.Cash;

public class Client implements Runnable {
    private static final int DESISION_COUNT = 6;
    private int id;
    private Bank bank;

    public int getId() {
        return id;
    }

    public Client(int id, Bank bank) {
        this.id = id;
        this.bank=bank;
    }

    @Override
    public void run() {
        Currency currency=new Currency((int)(Math.random()*100),(int)(Math.random()*99),"RUB");

                int cashierCount=bank.getCashierArrayList().size();
                int cashierNumber=(int)(Math.random()*cashierCount);
                Cashier cashier=bank.getCashierArrayList().get(cashierNumber);
                action(decision(),cashier,currency);


    }

    private boolean action(int decision, Cashier cashier, Currency currency) {
        boolean made=false;
        String str=new String();
                System.out.println("Cashier:"+cashier.toString());
        switch (decision){
            case 0:
                    cashier.refill(currency);
                    str="refilled";
                    made=true;
                    break;
            case 1:
                    str="took";
                    cashier.take(currency);
                    made=true;
                    break;
            case 2:
                    str="tranfered";
                    cashier.transfer(currency);
                    made=true;
                    break;
            case 3:
                    str="exchanged";
                    cashier.exchange(currency);
                    made=true;
                    break;
            case 4: str="went away";
                    made=true;
                    break;
        }
                System.out.println("Client: "+this.getId()+" "+str+" "+currency+", Cashier:"+cashier);

        return made;
    }

    private int  decision() {
        int decision=(int)(Math.random()*DESISION_COUNT);

        return decision;
    }
}
