package rashkevich.lesson16.Taskb3;

import java.util.concurrent.TimeUnit;

public class User implements Runnable{
    private int id;
    private CallCenter callCenter;
    public User(int id, CallCenter callCenter) {
        this.id = id;
        this.callCenter=callCenter;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        call();
    }

    public void call(){
        if(!callCenter.getOperatorList().isEmpty()){
            getOperator();
        } else {
            try {
                TimeUnit.MILLISECONDS.sleep(29);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!callCenter.getOperatorList().isEmpty()){
                getOperator();
            } else {
                System.out.println("User "+ this.id+ " has no free operators");
            }
        }
    }

    private void getOperator() {
        Operator operator=callCenter.getOperatorList().remove();
        System.out.println("Operator "+operator.getId()+" speaks to user "+this.id);
        try {
            TimeUnit.MILLISECONDS.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operator "+operator.getId()+" end the conversation with user "+this.id);
        callCenter.getOperatorList().add(operator);
    }


}

