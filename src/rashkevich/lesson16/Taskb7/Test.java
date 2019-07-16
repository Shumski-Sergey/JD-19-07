package rashkevich.lesson16.Taskb7;

public class Test {
    public static void main(String[] args){
        Currency rub=new Currency(30,57,"RUB");
        Currency buks=new Currency(50,41,"$");
//        Currency rub2=Currency.multiply(rub1,0.54321);
//        System.out.println(rub2.toString());

        Cashier cashier=new Cashier(0);
        cashier.pay(rub);
        // cashier.exchangeRubInBuks(rub1);
        System.out.println(cashier);
    }
}
