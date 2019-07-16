package rashkevich.lesson16.Taskb7;

import java.util.ArrayList;

public class Bank {
   private ArrayList<Cashier> cashierArrayList;
   private int cashierCount;

    public ArrayList<Cashier> getCashierArrayList() {
        return cashierArrayList;
    }

    public Bank(int cashierCount) {
        this.cashierCount = cashierCount;
        cashierArrayList=new ArrayList();
        for (int i=0;i<cashierCount;i++){
            Cashier cashier=new Cashier(i);
            cashierArrayList.add(cashier);
        }
    }
}
