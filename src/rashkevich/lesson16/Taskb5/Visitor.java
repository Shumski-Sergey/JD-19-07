package rashkevich.lesson16.Taskb5;

import tolifer.L7.paymentCard.Cash;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Visitor implements Runnable{
    private static final long TIME_TO_SLEEP = 50;
    private int id;
    private Restaurant restaurant;
    private int currentCashBoxId;


    public Visitor(int id, Restaurant restaurant) {
        this.id = id;
        this.restaurant=restaurant;
    }

    @Override
    public void run() {

            chooseCashBox();


        while(!getMeal()){
            try {
                TimeUnit.MILLISECONDS.sleep((long)(Math.random()*TIME_TO_SLEEP));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                changeCashBox();
                //System.out.println("Visitor"+this.id+" in the queue "+this.currentCashBoxId+" tried change queue");
        }
    }

    private void changeCashBox() {
        if(makeDecision()){
            try {
                restaurant.getSemaphore().acquire();
                    int visitorPositionInList=restaurant.getCashBoxList().get(currentCashBoxId).getVisitorList().indexOf(this);
                    int newCashBoxId=currentCashBoxId;//visitor new Cash Box
                    for(CashBox cashBox:restaurant.getCashBoxList()){
                        if(visitorPositionInList>cashBox.getVisitorList().size()+1){ //it is usefull to change queue when it is smaller more then 2 personsd
                            newCashBoxId=cashBox.getId();
                        }
                    }

                    if (currentCashBoxId!=newCashBoxId){
                        restaurant.getCashBoxList().get(currentCashBoxId).removeVisitor(this);
                        restaurant.getCashBoxList().get(newCashBoxId).addVisitor(this);
                        System.out.println("Visitor "+this.id+" went to the queue "+currentCashBoxId+", visitor position:"+restaurant.getCashBoxList().get(newCashBoxId).getVisitorList().indexOf(this));
                    }
                    currentCashBoxId=newCashBoxId;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            restaurant.getSemaphore().release();
        }
    }

    private boolean makeDecision() {
        final int PERCENT=100;
        boolean decision=false;
        int decisionPercent=(int)(Math.random()*PERCENT);
        if (decisionPercent>50){
            decision=true;
        }

        return decision;
    }

    private boolean getMeal() {
        boolean isGotMeal = false;
            int visitorPositionInList = restaurant.getCashBoxList().get(currentCashBoxId).getVisitorList().indexOf(this);
            if (visitorPositionInList == 0) {
                System.out.println("Visitor " + this.id + " got meal in cash box " + currentCashBoxId + " and went away");
                restaurant.getCashBoxList().get(currentCashBoxId).removeVisitor(this);
                isGotMeal = true;
            }

        return isGotMeal;
    }

    private void chooseCashBox() {
            int smallestVisitorListCount = restaurant.getCashBoxList().get(0).getVisitorList().size();
            int smallestVisitorListId = 0;
            for (CashBox cashBox : restaurant.getCashBoxList()) {
                if (smallestVisitorListCount > cashBox.getVisitorList().size()) {
                    smallestVisitorListCount = cashBox.getVisitorList().size();
                    smallestVisitorListId = cashBox.getId();
                }
            }
            CashBox cashBox = restaurant.getCashBoxList().get(smallestVisitorListId);
            cashBox.addVisitor(this);
            currentCashBoxId = smallestVisitorListId;
            System.out.println("Visitor " + this.id + " chose the queue " + currentCashBoxId + ", visitor position:" + restaurant.getCashBoxList().get(currentCashBoxId).getVisitorList().indexOf(this));
    }
}
