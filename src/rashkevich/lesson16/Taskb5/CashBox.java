package rashkevich.lesson16.Taskb5;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class CashBox {
    private int id;
    private LinkedList<Visitor> visitorList;
    private Semaphore semaphore=new Semaphore(1);

    public CashBox(int id) {
        this.id = id;
        visitorList =new LinkedList();
    }

    public int getId() {
        return id;
    }

    public LinkedList<Visitor> getVisitorList() {
        return visitorList;
    }

    public void addVisitor(Visitor visitor){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(!visitorList.contains(visitor)){
            visitorList.add(visitor);
        }
        semaphore.release();
    }

    public Visitor removeVisitor(Visitor visitor){
        boolean isVisitorRemoved=false;
        while(!isVisitorRemoved){
            isVisitorRemoved=visitorList.remove(visitor);
        }

        return visitor;
    }
}
