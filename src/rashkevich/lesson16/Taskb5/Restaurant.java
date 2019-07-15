package rashkevich.lesson16.Taskb5;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class Restaurant {
    private LinkedList<CashBox> cashBoxList;
    private int cashBoxCount;
    private Semaphore semaphore=new Semaphore(1);//for stopping all changes until one visitor change his queue

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public Restaurant(int cashBoxCount) {
        cashBoxList=new LinkedList();
        for (int i=0;i<cashBoxCount;i++){
            CashBox cashBox=new CashBox(i);
            cashBoxList.add(cashBox);
        }
    }

    public LinkedList<CashBox> getCashBoxList() {
        return cashBoxList;
    }
}
