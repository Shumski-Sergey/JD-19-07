package rashkevich.lesson16.Taskb7;

public class BankRunner {

    public static void main(String[] args){
    final int CLIENT_COUNT=100;
    final int DOWN_CASHIER_CURRENCY_LIMIT=200;
        Bank bank=new Bank(3);
        Thread observer=new Thread(new Observer(bank,DOWN_CASHIER_CURRENCY_LIMIT));
        observer.start();
        //System.out.println("!!!");
        for (int i=0;i<CLIENT_COUNT;i++){
            Thread client=new Thread(new Client(i,bank));
            client.start();
        }
    }
}
